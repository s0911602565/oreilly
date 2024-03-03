package com.johnlee.smalexercise.control;

import com.johnlee.smalexercise.bean.Coffee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Q3")
public class Q3 {
    /*
    http://127.0.0.1:8080/Q3/getMessage1

    post man
    {
        "id": "100",
        "name": "嗨"
    }
    */

    @RequestMapping("getMessage1")
    void getMessage1(@RequestBody Coffee coffee){

        List<Coffee> list = new ArrayList<Coffee>();
        list.addAll(List.of(
                new Coffee("100","john1"),
                new Coffee("200","john2"),
                new Coffee("300","john3")
        ));

        System.out.println("remove Before size:" +list.size());

        //p亂取的 ，代表Coffee類別
        list.removeIf(p -> p.getId().equals(coffee.getId()));


        System.out.println("remove After size:" +list.size());
        list.add(coffee);

        for(Coffee myCoffee : list){
            System.out.println(myCoffee.getId() + " " + myCoffee.getName());
        }

    }
}
