package main.stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(arr));
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));
        int res = Arrays.stream(arr).filter(i->i%2==1).map(i->{if(i%3==0){i = i/3;}return i;}).reduce(Integer::sum).getAsInt();
        System.out.println(res);

    }
}
