package main.stream;

public class Students implements Comparable<Students>{
    String name;
    char sex;
    int age;
    int course;

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Students(String name, char sex, int age, int course) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    public int getCourse() {
        return course;
    }

    @Override
    public int compareTo(Students o) {
        return this.name.compareTo(o.getName());
    }
}
