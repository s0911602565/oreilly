package com.johnlee.smalexercise.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


/*
#SQL Script
create database z1;
use z1;
create table x2(
id int not null primary key auto_increment,
name varchar(100)
)
*/
@Data
@Entity
public class x2 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id ;
    private String name;
}
