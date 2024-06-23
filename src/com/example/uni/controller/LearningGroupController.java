package com.example.uni.controller;

import com.example.uni.model.Db.DataBase;
import com.example.uni.model.LearningGroup;
import com.example.uni.model.impl.Student;
import com.example.uni.model.impl.Teacher;
import com.example.uni.service.LearningGroupService;

import java.util.List;

public class LearningGroupController {
    private LearningGroupService service = new LearningGroupService();

    public LearningGroup createLearningGroup(int teacherId, Integer[] studentsIds) throws Exception {
        return service.createLearningGroup(teacherId, studentsIds);
    }

    public List<LearningGroup> getAllLearningGroup () {
        return service.getAllLearningGroup();
    }
}
