package com.johnlee.smalexercise.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Q5_Value2")
public class Q5_Value2 {
    @Value("${Q5-Message2:default value2~}")
    private String name;

    /*
    http://127.0.0.1:8080/Q5_Value2/getMessage1
    * */
    @RequestMapping("getMessage1")
    String getMessage1(){
        return name;
    }

}
