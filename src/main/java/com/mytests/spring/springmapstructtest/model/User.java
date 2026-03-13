package com.mytests.spring.springmapstructtest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
    private String email;
}
