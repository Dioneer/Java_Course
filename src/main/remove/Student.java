package main.remove;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int course;
    private char sex;

    public Student(String name, int age, int course, char sex) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", sex=" + sex +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return this.age == student.age && this.course == student.course &&
//                this.sex == student.sex && Objects.equals(name, student.name);
//    }

}
