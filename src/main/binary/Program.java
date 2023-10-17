package main.binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
         List<Integer> bb= new ArrayList<>();
         bb.add(1);
        bb.add(45);
        bb.add(65);
        bb.add(234);
        bb.add(4);
        bb.add(9);
        Collections.sort(bb);
        System.out.println(bb);
        serchB(bb, 36);
    }
    public static void serchB(List<Integer> bb, int key){
        int min = 0;
        int max = bb.size()-1;
        while (min<=max){
            int mid = (min+max)/2;
            if(bb.get(mid)<key){
                min = mid+1;
            }else if(bb.get(mid)>key){
                max = mid-1;
            }else{
                System.out.println("Index is " + mid);
                return;
            }
        }
        System.out.println(-1);
        return;
    }
}
