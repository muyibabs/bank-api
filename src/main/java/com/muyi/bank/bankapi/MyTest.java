package com.muyi.bank.bankapi;

import java.util.*;
import java.util.stream.Collectors;

public class MyTest {

    public static void main(String[] args) {




        List<Student> students = new ArrayList<>();
        students.add(new Student(3,"Angel"));
        students.add(new Student(15,"John"));
        students.add(new Student(6,"Christine"));
        students.add(new Student(7,"Brian"));

        students.forEach(System.out::println);
        System.out.println();
        Comparator<Student> comparator=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.id-o2.id;
            }
        };

        //Comparator<Student> compareByName = (Student s1, Student s2) -> s1.name.compareTo(s2.name);
        Comparator<Student> myComp = (Student s1, Student s2) -> s1.name.compareTo(s2.name);;
        Collections.sort(students, myComp);
        students.forEach(System.out::println);
    }

}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
