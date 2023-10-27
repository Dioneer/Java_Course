package main.nested;

public class Test {
    String color;
    int doorCount;
    Engine engine;
    static int count;
    static{
        ++count;
    }

    public Test(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Test{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
    int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsepower=" + horsepower +
                    '}';
        }
    }
}
class Main{
    public static void main(String[] args) {
        Test.Engine e = new Test.Engine(25);
        Test t = new Test("red", 2, e);
        Test t2 = new Test("red", 2, e);
        Test t3 = new Test("red", 2, e);
        System.out.println(Test.count);
    }
}
