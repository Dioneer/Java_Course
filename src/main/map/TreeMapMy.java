package main.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMy {
    public static void main(String[] args) {
        TreeMap<Student, Double> ii= new TreeMap<>();
        Student stt1 = new Student("Elena1", "Iknk", "3");
        Student stt2 = new Student("Elena1", "Iknkk", "3");
        Student stt3 = new Student("Elena1", "Iknk", "1");
        Student stt4 = new Student("Elena4", "Iknk", "3");
        Student stt5 = new Student("Elena5", "Iknk", "3");
        Student stt6 = new Student("Elena6", "Iknk", "3");
        Student stt7 = new Student("Elena6", "Iknk", "3");
        Student stt8 = new Student("Elena6", "Iknk", "4");
        ii.put(stt1,5.8);
        ii.put(stt2,6.8);
        ii.put(stt3,7.8);
        ii.put(stt4,8.8);
        ii.put(stt5,9.8);
        ii.put(stt6,1.8);
//        ii.put(11.8,stt7);
//        ii.put(11.8,stt8);
//        for(Map.Entry<Double, Student>item: ii.entrySet()){
//            System.out.println(item);
//        }
//        System.out.println(ii.get(5.8));
//        System.out.println(ii.remove(11.8));
//        System.out.println(ii.tailMap(7.8));
        System.out.println(ii);
    }
}
