package com.example.springDatabase.demoDatabase.Controller;


import com.example.springDatabase.demoDatabase.course.jdbc.Cource;

import com.example.springDatabase.demoDatabase.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {

    @Autowired
    private CourseJdbcRepository repo;


    @GetMapping("/data")
    public String adddata()
    {


        repo.insert(new Cource(1,"java","jetbrains"));

        repo.insert(new Cource(2,"python","python"));

        repo.insert(new Cource(3,"javascript","java script"));

        repo.insert(new Cource(4,"react","meta"));
        return "Data Inserted...!";
    }
}
