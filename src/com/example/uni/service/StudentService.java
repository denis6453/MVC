package com.example.uni.service;

import com.example.uni.model.Db.DataBase;
import com.example.uni.model.impl.Student;

import java.util.List;

public class StudentService {
    public Student createStudent(String name, String lastName, Integer groupId) {
        int id;
        int size = DataBase.studentsDb.size();
        if(size == 0) id = 1;
        else id = size + 1;

        Student student = new Student(id, name, lastName, groupId);

        DataBase.studentsDb.add(student);

        return student;
    }

    public Student getById (Integer id) throws Exception{
        Student student = DataBase.studentsDb
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if(student == null){
            throw new Exception("Student Not Found");
        }
        return student;
    }

    public List<Student> getAllStudents () {
        return DataBase.studentsDb;
    }
}
