package com.example.uni.model;

import com.example.uni.model.impl.Student;
import com.example.uni.model.impl.Teacher;

import java.util.List;

public class LearningGroup {
    private Teacher teacher;
    private List<Student> students;

    public LearningGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "LearningGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}' + '\n';
    }
}
