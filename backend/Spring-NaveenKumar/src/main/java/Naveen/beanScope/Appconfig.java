package Naveen.beanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Value("${data.user}")
    private String name;

//    System.out.println(name);
    @Bean
    public void helloWorld(){
        System.out.println(name);
//        return new HelloWorld();
    }

}
