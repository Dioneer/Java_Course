package main.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Students st1 = new Students("Igor", 'm', 22,2);
        Students st2 = new Students("Agor", 'f', 25,3);
        Students st3 = new Students("Dgor", 'm', 24,4);
        Students st4 = new Students("Fgor", 'f', 21,5);
        Students st5 = new Students("Zgor", 'f', 21,5);
        List<Students> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
//        Map<Integer, List<Students>> map = students.stream().map(i-> {
//            i.setName(i.getName().toUpperCase()); return i;}).collect(Collectors.groupingBy(el->el.getCourse()));
//        for(Map.Entry<Integer, List<Students>> item : map.entrySet()){
//            System.out.println(item);
//        }
//        Map<Boolean, List<Students>> map =students.stream().collect(Collectors.partitioningBy(i->i.getSex()=='f'));
//        for(Map.Entry<Boolean, List<Students>> item: map.entrySet()){
//            System.out.println(item);
//        }
//        Students min = students.stream().min((x,y)->x.getAge()-y.getAge()).get();
//        System.out.println(min);
//        Students max = students.stream().max((x,y)->x.getAge()-y.getAge()).get();
//        System.out.println(max);
//        students.stream().filter(i->i.getAge()>20).limit(2).forEach(System.out::println);
//        students.stream().filter(i->i.getAge()>20).skip(2).forEach(System.out::println);
//        List<Integer> course = students.stream()
//                .mapToInt(Students::getCourse)
//                .boxed()
//                .toList();
    }
}
