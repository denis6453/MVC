package com.example.uni.model.Db;

import com.example.uni.model.LearningGroup;
import com.example.uni.model.impl.Student;
import com.example.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static final List<Student> studentsDb = new ArrayList<>();

    public static final List<Teacher> teachersDb = new ArrayList<>();

    public static final List<LearningGroup> learningGroupsDb = new ArrayList<>();


    public static void fillDb () {
        Teacher teacher = new Teacher(1, "Денис", "Домашенко");

        Teacher teacher2 = new Teacher(2, "Иван", "Иванов");


        teachersDb.add(teacher);
        teachersDb.add(teacher2);

        Student student1 = new Student(1,"тест", "студент");
        Student student2 = new Student(2,"тест2", "студент2");

        studentsDb.add(student1);
        studentsDb.add(student2);

        LearningGroup learningGroup = new LearningGroup(teacher, List.of(student1, student2));

        learningGroupsDb.add(learningGroup);
    }
}
