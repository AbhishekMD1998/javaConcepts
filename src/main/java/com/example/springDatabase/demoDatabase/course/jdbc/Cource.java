package com.example.springDatabase.demoDatabase.course.jdbc;


import lombok.Data;

@Data
public class Cource {
    public int getId() {
        return id;
    }

    public Cource(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    private int id;
    private String name;
    private String author;

}
