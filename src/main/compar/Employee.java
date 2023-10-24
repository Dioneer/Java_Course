package main.compar;

import java.util.Objects;

public class Employee{
    int id;
    String name;
    String surname;
    int salary;
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.surname.compareTo(o.getSurname());
//    }

}
