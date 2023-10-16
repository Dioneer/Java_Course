package main.iterator;

import main.remove.Student;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Student st1 = new Student("Misha", 32, 5, 'm');
        Student st2 = new Student("Mosha", 23, 4, 'm');
        Student st3 = new Student("Sasha", 18, 1, 'm');
        Student st4 = new Student("Sima", 20, 3, 'm');
        List<Student> group= new ArrayList<>();
        group.add(st1);
        group.add(st2);
        group.add(st3);
        group.add(st4);
        Iterator<Student> iterator = group.iterator();
        String s = "ASDFGhlGFDSA";
        List<Character> ss = new ArrayList<>();
        for (char i: s.toCharArray()) {
            ss.add(i);
        }
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator<Character> iterator1 = ss.listIterator();
        ListIterator<Character> reviterator2 = ss.listIterator(ss.size());
        boolean isP = true;
        while (iterator1.hasNext()&&reviterator2.hasPrevious()){
            if(iterator1.next() != reviterator2.previous()){
                isP  = false;
                break;
            }
        }
        System.out.println(isP);
    }
}
