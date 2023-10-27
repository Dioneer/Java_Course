package main.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflections {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Class employee = Class.forName("main.reflection.Employee");
        Employee employee1 = new Employee("Egor", "IT", 5);
        Class emp = employee1.getClass();
//        Constructor<Employee> constructor = employee.getConstructor();
//        Employee employee1 = constructor.newInstance();
//        Constructor<Employee> constructor2 = employee.getConstructor(String.class, String.class,int.class);
//        Employee employee2 = constructor2.newInstance("Egor", "IT", 5);
//        System.out.println(employee2);
//        Method method = employee.getMethod("setSalary", double.class);
//        method.invoke(employee2, 800.20);
//        System.out.println(employee2);
        Field field = emp.getDeclaredField("salary");
        field.setAccessible(true);
        double sall = (Double) field.get(employee1);
        System.out.println(sall);
    }
}
