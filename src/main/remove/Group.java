package main.remove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Group {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("ds");
        Student st1 = new Student("Misha", 32, 5, 'm');
        Student st2 = new Student("Mosha", 23, 4, 'm');
        Student st3 = new Student("Sasha", 18, 1, 'm');
        Student st4 = new Student("Sima", 20, 3, 'm');
        List<Student> group= new ArrayList<>();
        List<Student> group2= new ArrayList<>();
        group.add(st1);
        group.add(st2);
        group.add(st3);
        group.add(st4);
        group2.add(st1);
        group2.add(st2);
        group2.add(st3);
        group2.add(st4);
        group.indexOf(st1);
        String[] sa = lists.toArray(new String[1]);
//        System.out.println(group.indexOf(st2));
//        for (String s:sa){
//            System.out.println(s);
//        }
//        Student st5 = new Student("Sima", 20, 3, 'm');
//        group.remove(st5);
//        group.remove(st3);
//        System.out.println(group.indexOf(st2));
//        int r = 1;
//        System.out.println(r == 0);
//        Integer[] rrr = new Integer[]{1,2,3,4,5,6};
//        List<Integer> rr = new ArrayList<>(List.of(rrr));
//        rr.add(2);
//        rr.forEach(System.out::println);
//        group2.remove(st3);
        Student[] st = group2.toArray(new Student[0]);
        System.out.println(Arrays.toString(st));
    }
}
