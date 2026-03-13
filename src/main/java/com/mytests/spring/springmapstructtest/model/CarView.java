package com.mytests.spring.springmapstructtest.model;

public class CarView
{
    private final int id;

    private final String name;

    public CarView(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
