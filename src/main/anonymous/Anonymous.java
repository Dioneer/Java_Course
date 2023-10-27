package main.anonymous;

import main.lambda.Main;

public class Anonymous{
    private final int x = 6;
    public static void main(String[] args) {
        Math math = new Math() {
            final Anonymous anonymous = new Anonymous();
            @Override
            public int mathOperation(int a, int b) {
                return a+b +anonymous.x;
            }
        };
        System.out.println(math.mathOperation(5,6));
    }
}
