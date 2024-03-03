package com.johnlee.smalexercise.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.johnlee.smalexercise.bean.Dog;
@RestController
@RequestMapping("Q6_Value3")
public class Q6_Value3 {

    private final Dog dog;
    public Q6_Value3(Dog d){
        this.dog = d;
    }

    /*
    http://127.0.0.1:8080/Q6_Value3/getMessage1
    * */
    @RequestMapping("getMessage1")
    String getMessage1(){
        System.out.println("id:"+dog.getId());
        System.out.println("name:"+dog.getName());
        return "successful";
    }

}
