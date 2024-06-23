package com.example.uni.view;

import com.example.uni.controller.StudentController;
import com.example.uni.model.Db.DataBase;
import com.example.uni.model.impl.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentController controller = new StudentController();

    public void start() {
        DataBase.fillDb();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - выход");

            switch (scanner.nextInt()) {
                        case 1 -> createStudent();
                        case 2 -> getById();
                        case 3 -> getAllStudents();
                        case 4 -> System.exit(0);

                        default -> System.out.println("Операция не поддерживается");
                    }
        }
    }


    private Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя");
        String name = scanner.nextLine();
        System.out.println("Введите Фамилию");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(name, lastName, groupId);
        System.out.println(student);
        return student;
    }

    private Student getById () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Id студента");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllStudents () {
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }
}
