package main.stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Students st1 = new Students("Igor", 'm', 22,2);
        Students st2 = new Students("Agor", 'f', 25,3);
        Students st3 = new Students("Dgor", 'm', 24,4);
        Students st4 = new Students("Fgor", 'f', 21,5);
        Students st5 = new Students("Zgor", 'f', 21,5);
        Facultet f1 = new Facultet("Mathematic");
        Facultet f2 = new Facultet("Histiory");
        f1.addStudent(st1);
        f1.addStudent(st2);
        f1.addStudent(st3);
        f2.addStudent(st4);
        f2.addStudent(st5);
        List<Facultet> arr = new ArrayList<>();
        arr.add(f1);
        arr.add(f2);
        arr.stream().flatMap(f->f.getStudents().stream()).forEach(i-> System.out.println(i.getName()));
    }
}
class Facultet{
    String name;
    List<Students> students;

    public Facultet(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public List<Students> getStudents() {
        return students;
    }
    public void addStudent(Students s){
        students.add(s);
    }
}