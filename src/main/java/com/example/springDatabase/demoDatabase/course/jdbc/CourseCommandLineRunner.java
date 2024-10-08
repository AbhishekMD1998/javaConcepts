package com.example.springDatabase.demoDatabase.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
   private CourseJdbcRepository repo;

    @Override
    public void run(String... args) throws Exception {
//        repo.insert(new Course("Java",1,"jetbrains"));
//        repo.insert(new Course("java script",2,"java script"));
//        repo.insert(new Course("React",3,"facebook"));
//        repo.insert(new Course("csharp",4,"C#"));
//        repo.insert(new Course("python",5,"python"));
    }
}
