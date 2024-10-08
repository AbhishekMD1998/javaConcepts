package com.example.springDatabase.demoDatabase.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_Query = """
            insert into cource (id,name,author)
           values (?, ?, ?);
            """;
   public void insert(Cource cource){
       System.out.println("Inserting course: " + cource);

       try {
           springJdbcTemplate.update(INSERT_Query, cource.getId(), cource.getName(), cource.getAuthor());
       } catch (DataAccessException e) {
           System.err.println("Error inserting course: " + e.getMessage());

       }
   }
}
