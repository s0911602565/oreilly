package com.johnlee.smalexercise.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
//b. 參閱 SmalExerciseApplication.class
//c. 參閱 application.properties 。 [Value_3]
@ConfigurationProperties(prefix="dog")
public class Dog {

    private int id;
    private String name;
    public Dog(){

    }
}
