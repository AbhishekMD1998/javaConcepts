package com.example.springDatabase.demoDatabase.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_Query = """
            insert into cource (id,name,author)
            values(2,'springBoot','coursejava');
            """;
   public void insert(){
       springJdbcTemplate.update(INSERT_Query);
   }
}
