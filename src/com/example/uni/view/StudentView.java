package com.example.uni.view;

import com.example.uni.controller.LearningGroupController;
import com.example.uni.controller.StudentController;
import com.example.uni.model.Db.DataBase;
import com.example.uni.model.LearningGroup;
import com.example.uni.model.impl.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentController controller = new StudentController();

    private LearningGroupController learningGroupController = new LearningGroupController();

    public void start() throws Exception {
        DataBase.fillDb();

        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - создать учебную группу");
            System.out.println("5 - распечатать учебные группы");
            System.out.println("6 - перейти в создание группы студентов");

            switch (scanner.nextInt()) {
                        case 1 -> createStudent();
                        case 2 -> getById();
                        case 3 -> getAllStudents();
                        case 4 -> createLearningGroup();
                        case 5 -> printAllLearningGroups();
                        case 6 -> System.exit(0);

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
        Student student = controller.createStudent(name, lastName);
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


    private LearningGroup createLearningGroup() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ids студентов через пробел");
        String input = scanner.nextLine();
        String[] studentIds = input.split(" ");

        Integer[] convertStudentIds = new Integer[studentIds.length];

        for (int i = 0; i < studentIds.length; i++) {
            convertStudentIds[i] = Integer.parseInt(studentIds[i]);
        }

        System.out.println("Введите Id преподавателя");
        String teacher = scanner.nextLine();

        int teacherId = Integer.parseInt(teacher);

        return learningGroupController.createLearningGroup(teacherId, convertStudentIds);
    }


    private void printAllLearningGroups () {
        System.out.println(learningGroupController.getAllLearningGroup());
    }

}
