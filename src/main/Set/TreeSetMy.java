package main.Set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMy {
    public static void main(String[] args) {
        TreeSet<Student1> treeset= new TreeSet<>();
        Student1 st1 = new Student1("Igor1", 1);
        Student1 st2 = new Student1("Igor2", 4);
        Student1 st3 = new Student1("Igor3", 3);
        Student1 st4 = new Student1("Igor4", 4);
//        treeset.add(1);
//        treeset.add(2);
//        treeset.add(3);
//        treeset.add(14);
//        treeset.add(5);
        treeset.add(st1);
        treeset.add(st2);
        treeset.add(st3);treeset.add(st4);
        System.out.println(treeset);
        for (Student1 item: treeset) {
            if(item==st1){
                System.out.println(14);
            }
            System.out.println(item);
        }
        System.out.println(treeset.first());
    }
}
    final class Student1 implements Comparable<Student1>{
    final String name;
    final int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public Student1(String name, int course) {
        this.name = name;
        this.course = course;
    }

        @Override
        public String toString() {
            return "Student1{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }

        @Override
        public int compareTo(Student1 o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student1 student1 = (Student1) o;
            return Objects.equals(name, student1.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, course);
        }
    }