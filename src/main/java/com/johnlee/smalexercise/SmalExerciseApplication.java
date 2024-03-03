package com.johnlee.smalexercise;

import com.johnlee.smalexercise.bean.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan //a. 參閱 Dog.class
public class SmalExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmalExerciseApplication.class, args);
    }


    //a. 建立 Cat.class
    //b. 參閱 application.properties 。 [Value_4]
    @Bean
    @ConfigurationProperties(prefix = "cat")
    Cat myCat(){
        return new Cat();
    }
}
