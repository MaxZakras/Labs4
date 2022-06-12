package com.hello;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Comparator;



class Student {

    String name;
    String surname;
    String Facult;
    int age;
    int course;

    Student(String name, String surname, String Facult, int age, int course) {
        this.name = name;
        this.surname = surname;
        this.Facult = Facult;
        this.age = age;
        this.course = course;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }
    String getFacult() {
        return Facult;
    }

    int getAge() {
        return age;
    }
    int getCourse() {
        return course;
    }



    public void print() {

        String str = String.format("Name %s Surname:  %s Facult:  %sAge :%s Course: %s", this.getName(), this.getSurname(),this.getFacult(),this.getAge(),getCourse());
        System.out.println(str);
    }
}

public class Main {
    public static final ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {

        int NZK = 1110;

        System.out.println("NZK: = " + NZK + "\n C_11: = " + (NZK%11));

        students.add(new Student("John", "White",  "FIOT", 28, 3 ));
        students.add(new Student("Rayan", "Smith",  "FTI", 20, 2 ));
        students.add(new Student("Boris", "Goodman",  "FPM", 25,5 ));



        System.out.println("Sorted from min to max (Age)");
        students.sort(Comparator.comparing(Student::getAge));
        students.forEach(Student::print);
        System.out.println("Sorten from max to min (Name)");
        students.sort(Comparator.comparing(Student::getName,Comparator.reverseOrder()));
        students.forEach(Student::print);

    }
}