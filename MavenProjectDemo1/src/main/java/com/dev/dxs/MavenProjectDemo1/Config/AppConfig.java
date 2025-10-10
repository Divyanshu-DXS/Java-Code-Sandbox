package com.dev.dxs.MavenProjectDemo1.Config;

import ExternalConfigFolder.AppConfigExternal;
import com.dev.dxs.MavenProjectDemo1.Employee;
import com.dev.dxs.MavenProjectDemo1.Profession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(AppConfigExternal.class)
public class AppConfig {

    @Bean
    public Profession getProfessionBean(){
        return new Profession();
    }

    @Bean
    public Employee getDev(){
        Employee dev = new Employee();
        dev.setfName("Dev");
        dev.setlName("DXS");
        dev.setRole(getProfessionBean());
        return dev;
    }

    @Bean
    public  Employee getAlex(Profession profession){
        Employee alex = new Employee("Alex","DXS",getProfessionBean());
        return alex;
    }
}
