package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * Student 实体类
 *
 * @author:
 * @create:
 */
@Data
public class Student {

    private int id;
    private int student_id;
    private String name;
    private int age;
    private String sex;
    private Date birthday;


}