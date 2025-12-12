package com.dxs.springSecurityDemo.SpringSecurity_1.service;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("div")){
            return User.builder()
                    .username("div")
                    .password("$2a$10$WF/GiOyT2wwUCAfe2XXxT.n3fP3jq5GYeeC8C0gQ/vcittdJfzvEy") // encoded password
                    .roles("DEV")
                    .build();
        }
        if(username.equals("boss")){
            return User.builder()
                    .username("boss")
                    .password("$2a$10$oVlHu8H7D4RM8rANi1vBP.at3YPxsNI8gLebT4YdxmIC7V7gh/ggC") // encoded password
                    .roles("ADMIN")
                    .build();
        }
        if(username.equals("simmy")){
            return User.builder()
                    .username("simmy")
                    .password("$2a$10$WF/GiOyT2wwUCAfe2XXxT.n3fP3jq5GYeeC8C0gQ/vcittdJfzvEy") // encoded password
                    .roles("MANAGER")
                    .build();
        }
        else
            throw new UsernameNotFoundException("UserName not found");
    }

}
