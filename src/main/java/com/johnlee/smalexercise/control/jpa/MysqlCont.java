package com.johnlee.smalexercise.control.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.johnlee.smalexercise.bean.x2;
import java.sql.*;

@RestController
@RequestMapping("MysqlCont")
public class MysqlCont {

    @Autowired
    private CoffeeRepository c;
    public MysqlCont(){}
    public MysqlCont(CoffeeRepository c){this.c = c;}
    /*
        main()
    * */

    public static void main(String[] args ) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/z1?useSSL=false";
            Connection c = DriverManager.getConnection(url, "root", "12345678");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from x2 ");
            System.out.println(1);
            while (rs.next()) {
                System.out.println("getMessage1 id: "+rs.getString("id"));
                System.out.println("getMessage1 name : "+rs.getString("name"));
            }
            System.out.println(2);
            rs.close();
            s.close();
            c.close();


        } catch (Exception e) {
            System.out.println(3);
        }

    }
    /*
        http://127.0.0.1:8080/MysqlCont/getMessage2
    * */
    @RequestMapping("getMessage2")
    public x2 getMessage2() throws Exception {
        x2 x= new x2();
        x.setId(1);
        x.setName("kptv");
        System.out.println("ex save");
        return c.save(x);
    }
}
