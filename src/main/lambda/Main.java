package main.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    void testStudents(ArrayList<Student4> al, StudentChecks sc){
        for (Student4 s:al){
          if(sc.check(s)){
              System.out.println(s);
          }
        }
    }
    public static void main(String[] args) {
        Student4 st1 = new Student4("Ivan", 'm', 22, 2, 5.8);
        Student4 st2 = new Student4("Elena", 'f', 34, 1, 6.8);
        Student4 st3 = new Student4("Petr", 'm', 43, 4, 7.8);
        Student4 st4 = new Student4("Nike", 'm', 23, 5, 8.8);
        ArrayList<Student4> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
//        Collections.sort(students, new Comparator<Student4>() {
//            @Override
//            public int compare(Student4 o1, Student4 o2) {
//                return o1.course - o2.course;
//            }
//        });
        Collections.sort(students, (Student4 o1, Student4 o2) -> o1.course - o2.course);
        System.out.println(students);
//        Main info = new Main();
//        info.printStudentsUnderAge(students,34);
        /**
         * переписать интерфейс анонимной функцией
         */
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student4 s) {
//                return s.age<30;
//            }
//        });
//        System.out.println("===========================================");
        /**
         * написать отдельный класс с реализацией
         */
//        info.testStudents(students,new CheckOverGrade());
//        System.out.println("===========================================");
//        info.printStudentsMixCondition(students,34,'m', 8);
        /**
         * запустить лямбду
         */
//        info.testStudents(students, (Student4 s) ->{return s.age<30;});
    }
//    public void printStudentsOverGrade(ArrayList<Student4> al, double grade){
//        for (Student4 s: al) {
//            if(s.avg>grade){
//                System.out.println(s);
//            }
//        }
//
//    }
//    public void printStudentsUnderAge(ArrayList<Student4> al, int age){
//        for (Student4 s: al) {
//            if(s.age< age){
//                System.out.println(s);
//            }
//        }
//
//    }
//    public void printStudentsMixCondition(ArrayList<Student4> al,int age, char sex, double grade){
//        for (Student4 s: al) {
//            if(s.age> age && s.sex==sex && s.avg<grade){
//                System.out.println(s);
//            }
//        }
//    }
}
