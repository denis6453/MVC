package com.example.uni.service;

import com.example.uni.model.Db.DataBase;
import com.example.uni.model.LearningGroup;
import com.example.uni.model.impl.Student;
import com.example.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class LearningGroupService {
    public LearningGroup createLearningGroup(int teacherId, Integer[] studentIds) throws Exception {
        StudentService service = new StudentService();

        TeacherService teacherService = new TeacherService();


        List<Student> students = new ArrayList<>();

        for (Integer studentId : studentIds) {
            students.add(service.getById(studentId));
        }

        Teacher teacher = teacherService.getById(teacherId);

        LearningGroup learningGroup = new LearningGroup(teacher, students);

        DataBase.learningGroupsDb.add(learningGroup);

        return learningGroup;
    }

    public List<LearningGroup> getAllLearningGroup () {
        return DataBase.learningGroupsDb;
    }
}
