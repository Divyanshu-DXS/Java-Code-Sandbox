package com.dxs.springSecurityDemo.SpringSecurity_1.config;

import com.dxs.springSecurityDemo.SpringSecurity_1.service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class  SpringSecurtiyConfiguration {

    @Autowired
    CustomUserDetailService customUserDetailService;

//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.builder()
//                .username("div")
//                .password(passwordEncoder().encode("12345"))
//                .roles("USER")
//                .build();
//        UserDetails user2 = User.builder()
//                .username("boss")
//                .password(passwordEncoder().encode("8055"))
//                .roles("ADMIN")
//                .build();
//
//        List<UserDetails> userList = new ArrayList<>();
//        userList.add(user);
//        userList.add(user2);
//        return new InMemoryUserDetailsManager(userList);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(customUserDetailService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf->csrf.disable())
                .authenticationProvider(authenticationProvider())
                .authorizeHttpRequests( auth ->
                        auth
                                .requestMatchers("/public/**").permitAll()
                                .requestMatchers("/admin").hasRole("ADMIN")
                                .requestMatchers("/secured").authenticated()
                                .requestMatchers("/manager").hasRole("MANAGER")
                                .requestMatchers("/profile").hasAnyRole("ADMIN","DEV")
                                .anyRequest().authenticated()
                )
                .formLogin(form -> form
                .permitAll())
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/logout-msg")
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .permitAll());
        return http.build();
    }


}
