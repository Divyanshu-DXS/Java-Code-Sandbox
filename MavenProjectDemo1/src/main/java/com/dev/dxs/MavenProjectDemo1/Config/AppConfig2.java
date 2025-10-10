package com.dev.dxs.MavenProjectDemo1.Config;

import com.dev.dxs.MavenProjectDemo1.CompanyData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public CompanyData getCompany1(){
        CompanyData companyData = new CompanyData();
        companyData.setName("ABC Corp.");
        companyData.setId(1001);

        return companyData;
    }
}
