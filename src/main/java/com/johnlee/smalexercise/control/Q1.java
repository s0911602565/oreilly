package com.johnlee.smalexercise.control;

import com.johnlee.smalexercise.bean.Coffee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Q1")
public class Q1 {
    List<Coffee> list = new ArrayList();

    //建構式
    public Q1(){
        Coffee c1 = new Coffee("john 送去post man1");
        Coffee c2 = new Coffee("john 送去post man2");
        List listCollect = List.of(c1 , c2);
        list.addAll(listCollect);
    }

    /*
    http://127.0.0.1:8080/Q1/getMessage1

    貼上 post man
    [{
        "id": "56d6c1e4-28be-412c-9165-5f4ed02e4ef7",
        "name": "john 送去java 1"
    },
    {
        "id": "8a3397ae-4637-40d1-91c8-53d4fd51aff7",
        "name": "john 送去java 2"
    }]
    */
    @RequestMapping("getMessage1")
    public List<Coffee> getMessage1(@RequestBody List<Coffee> coffee){
        
        for(int i = 0 ; i < coffee.size() ; i++){//取得:post man
            Coffee c = coffee.get(i);
            System.out.println(c);
        }


        return list;//回傳:建構式
    }

}
