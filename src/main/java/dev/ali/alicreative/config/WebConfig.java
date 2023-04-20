package  dev.ali.alicreative.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

  

    public void addCorsMapping(CorsRegistry registry){
        registry
                .addMapping("/**")
                .allowedOrigins("http://localhost:9000")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "OPTION", "PUT");
    }

}
