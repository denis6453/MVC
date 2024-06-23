package com.example.uni.model.impl;

import com.example.uni.model.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }

    public void addGroup(Integer groupId) { //надо убрать
        groups.add(groupId);
    }
}
