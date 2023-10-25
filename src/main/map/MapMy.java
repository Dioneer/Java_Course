package main.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapMy {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(12445,"Mirra Imn");
        map1.put(32165,"Sira Jnh");
        map1.put(89765,"ASdasd sdfs");
        map1.put(45678,"Mike Popkin");
        map1.put(456778,"Mike Popkin");
        map1.put(null, null);
        map1.remove(null);
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.entrySet());
//        System.out.println(map1.containsValue("Mike Popkin"));
//        map1.putIfAbsent(456123,"Rik mjd");
//        System.out.println(map1.get(89765));
//        System.out.println(map1);
//        for(Map.Entry<Integer, String> item: map1.entrySet()){
//            System.out.println(item);
//        }
    }
}
