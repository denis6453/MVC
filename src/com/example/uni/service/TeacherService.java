package com.example.uni.service;

import com.example.uni.model.Db.DataBase;
import com.example.uni.model.impl.Student;
import com.example.uni.model.impl.Teacher;

public class TeacherService {
    public Teacher getById (Integer id) throws Exception{
        Teacher teacher = DataBase.teachersDb
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        if(teacher == null){
            throw new Exception("Student Not Found");
        }
        return teacher;
    }
}
