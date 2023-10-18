package main.queue;

import java.util.PriorityQueue;

public class PriorityQueueMy {
    public static void main(String[] args) {
        Student2 st1 = new Student2("asd", 5);
        Student2 st2 = new Student2("asda", 4);
        Student2 st3 = new Student2("Ira", 8);
        Student2 st4 = new Student2("Mira", 3);
        PriorityQueue<Student2>item = new PriorityQueue<>();
        item.add(st1);
        item.add(st2);
        item.add(st3);
        item.add(st4);
//        item.add(1);
//        item.add(2);
//        item.add(3);
//        item.add(4);
//        item.add(5);
        System.out.println(item);
        System.out.println(item.remove(5));
        System.out.println(item);
    }
}
final class Student2 implements Comparable<Student2> {
    final String name;
    final int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student2 o) {
        return this.course - o.getCourse();
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}