package main.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {
        Student stt1 = new Student("Elena1", "Iknk", "3");
        Student stt2 = new Student("Elena2", "Iknk", "3");
        Student stt3 = new Student("Elena3", "Iknk", "3");
        Map<Student, Double> st1= new HashMap<>();
        st1.put(stt1, 7.5);
        st1.put(stt2, 8.5);
        st1.put(stt3, 9.5);
        Student stt4 = new Student("Elena3", "Iknk", "3");
        boolean bool = st1.containsKey(stt4);
        System.out.println(bool);
        System.out.println(st1);
    }
}
final class Student implements Comparable<Student>{
    final String name;
    final String surname;
    final String course;

    public Student(String name, String surname, String course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        int res = this.name.compareTo(o.name);
        if(res==0){
            res = this.surname.compareTo(o.surname);
            if(res==0){
                res = this.course.compareTo(o.course);
            }
        }
        return res;
    }
}