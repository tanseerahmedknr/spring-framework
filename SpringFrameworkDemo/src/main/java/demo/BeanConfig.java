package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")

public class BeanConfig {

//                  This bean  is when you have to define configuration
//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
}
