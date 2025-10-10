package ExternalConfigFolder;

import com.dev.dxs.MavenProjectDemo1.CompanyData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigExternal {

    @Bean
    public CompanyData getCompanyData2(){
        CompanyData companyData = new CompanyData("DEF corp", 2002);
        return  companyData;
    }
}
