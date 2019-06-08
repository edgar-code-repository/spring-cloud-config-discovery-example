package com.example.movieinfoservice.model;

public class Movie {

    private String id;
    private String name;
    private int year;

    public Movie() {
    }

    public Movie(String id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return "Movie {" + "id='" + id + ", name='" + name + ", year=" + year + "}\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
