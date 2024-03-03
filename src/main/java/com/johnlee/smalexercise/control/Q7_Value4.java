package com.johnlee.smalexercise.control;

import com.johnlee.smalexercise.bean.Cat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Q7_Value4")
public class Q7_Value4 {

    private final Cat cat;
    public Q7_Value4(Cat c){
        this.cat = c;
    }

    /*
    http://127.0.0.1:8080/Q7_Value4/getMessage1
    * */
    @RequestMapping("getMessage1")
    String getMessage1(){
        System.out.println("ids:"+cat.getId());
        System.out.println("name:"+cat.getName());
        return "successful";
    }

}
