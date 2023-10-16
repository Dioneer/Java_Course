package main.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Igor", 1);
        Student2 st2 = new Student2("Igor1", 13);
        Student2 st3 = new Student2("Igor2", 11);
        Student2 st4 = new Student2("Igor3", 12);
        List<Student2> listArr = new LinkedList<>();
        listArr.add(st1);
        listArr.add(st2);
        listArr.add(st3);
        listArr.add(st4);
    }
}
class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}