package main.lambda;

public class Student4 {
    String name;
    char sex;
    int age;
    int course;
    double avg;

    public Student4(String name, char sex, int age, int course, double avg) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student4{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avg=" + avg +
                '}';
    }
}
