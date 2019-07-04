package main;

import comparators.NameCmp;
import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTestLauncher {
    public static void main(String[] args) {
        Student student1 = new Student("Sara", 1000);
        Student student2 = new Student("Anna", 2000);
        Student student3 = new Student("Peter", 1500);
        Student student4 = new Student("Zach", 850);
        Student student5 = new Student("Anna", 1500);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        Collections.sort(studentList);
        System.out.println("Sorted by name: " + studentList);

        Collections.sort(studentList, new NameCmp());
        System.out.println("Sorted by studentNumber: " + studentList);

        Collections.sort(studentList, Collections.reverseOrder());
        System.out.println("Sorted by reverse name: " + studentList.toString());
    }
}
