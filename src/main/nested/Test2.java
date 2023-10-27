package main.nested;

public class Test2 {
    String color;
    int doorCount;
    Engine engine;
    static int count;
    static{
        ++count;
    }

    public Test2(String color, int doorCount, int horsepower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsepower);
    }

    @Override
    public String toString() {
        return "Test{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
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
class Main2{
    public static void main(String[] args) {
        Test2 t = new Test2("red", 2, 150);
        Test2 t2 = new Test2("red", 2, 120);
        Test2 t3 = new Test2("red", 2, 25);
        System.out.println(t);
    }
}
