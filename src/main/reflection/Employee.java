package main.reflection;

public class Employee {
    public String name;
    public String department;
    public int id;
    private double salary = 1000.0;

    public Employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }
    public Employee(){}

//    public Employee(String name, String department, int id, double salary) {
//        this.name = name;
//        this.department = department;
//        this.id = id;
//        this.salary = salary;
//    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
    private void changeDepartment(String newDep){
        department = newDep;
        System.out.println("New department is" + department);
    }
    public void increaseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
