package com.example.uni.model.Db;

import com.example.uni.model.impl.Student;
import com.example.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static final List<Student> studentsDb = new ArrayList<>();

    public static final List<Teacher> teachersDb = new ArrayList<>();


    public static void fillDb () {
        Teacher teacher = new Teacher(1, "Денис", "Домашенко");

        teacher.addGroup(1);

        teachersDb.add(teacher);

        Student student1 = new Student(1,"тест", "студент", 1);
        Student student2 = new Student(2,"тест2", "студент2", 1);

        studentsDb.add(student1);
        studentsDb.add(student2);
    }
}
