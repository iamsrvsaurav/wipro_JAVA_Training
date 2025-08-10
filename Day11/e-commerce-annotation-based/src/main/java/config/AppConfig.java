package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yourcompany.ecommerce")
public class AppConfig {
    // No explicit bean declarations needed due to @ComponentScan
}
