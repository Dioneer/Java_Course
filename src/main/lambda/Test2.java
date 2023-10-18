package main.lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abs("Privet"));
    }

    public static void main(String[] args) {
        def((String s) -> {System.out.println(1); return s.length();});
    }
}
interface I{
    int abs(String s);
}