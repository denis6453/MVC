package com.example.uni.controller;

import com.example.uni.model.impl.Student;
import com.example.uni.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService service = new StudentService();

    public Student createStudent(String name, String lastName)  {
        return service.createStudent(name, lastName);
    }

    public Student getById (Integer id) {
        Student student = null;

        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudents () {
        return service.getAllStudents();
    }
}
