package com.johnlee.smalexercise.control;

import com.johnlee.smalexercise.bean.Tiger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Q4_Value1")
public class Q4_Value1 {
    @Value("${Q4-Message1:default value~}")
    private String name;

    /*
    http://127.0.0.1:8080/Q4_Value1/getMessage1
    * */
    @RequestMapping("getMessage1")
    String getMessage1(){
        Tiger t = new Tiger();
        t.setName("john");
        System.out.println(t.getName());
        return name;
    }

    public static void main(String[] args) {
        new Q4_Value1().getMessage1();
    }

}
