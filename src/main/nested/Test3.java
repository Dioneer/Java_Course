package main.nested;

public class Test3 {
    public static void main(String[] args) {
    Math math = new Math();
    math.getResult();
    }
}

class Math{
    public void getResult(){
        class Division{
            private int divisible;
            private int divider;

            public int getDivisible() {
                return divisible;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }
            public int getQuotient(){
                return divisible/divider;
            }
            public int getRemains(){
                return divisible%divider;
            }
        }
        Division division = new Division();
        division.setDivisible(21);
        division.setDivider(4);
        System.out.println(division.getDivisible() + " / " + division.getDivider()+" = "+division.getQuotient() +" % " + division.getRemains());
    }
}
