package com.johnlee.smalexercise.control;

import com.johnlee.smalexercise.bean.Coffee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("Q2")
public class Q2 {
    /*
    http://127.0.0.1:8080/Q2/getMessage1
    改成
    http://127.0.0.1:8080/Q2/getMessage1/1000
    */
    @RequestMapping("getMessage1/{id}")
    Optional<Coffee> getMessage1(@PathVariable String id){
        System.out.println("id:"+id);
        Coffee c = new Coffee("john");
        if(c != null)
            return Optional.of(c);
        return Optional.empty();

    }
}
