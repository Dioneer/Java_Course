package main.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employee = Class.forName("main.reflection.Employee");
//        Class employee2 = Employee.class;
//        Employee emp = new Employee();
//        Class emplyee3 = emp.getClass();
//        Field someFild = employee.getField("id");
//        Field[] someFild2 = employee.getFields();
//        for (Field item:someFild2){
//            System.out.println(item.getName() + " "+item.getType());
//        }
//        Field[] allf = employee.getDeclaredFields();
//        for (Field item : allf) {
//            System.out.println(item.getName() + " " + item.getType());
//        }
//        Method somMethod1 = employee.getMethod("setSalary", double.class);
//        System.out.println("Method " + somMethod1.getReturnType() + Arrays.toString(somMethod1.getParameterTypes()));

//        Method[] meth1 = employee.getDeclaredMethods();
//        for (Method item : meth1) {
//            if (Modifier.isPublic(item.getModifiers())) {
//                System.out.println(item.getName() + " " + item.getName() + item.getReturnType() + Arrays.toString(item.getParameterTypes()));
//            }
//        }
        Constructor[] const1 = employee.getConstructors();
        for (Constructor item : const1) {
            System.out.println(item.getName() + " " + item.getName() + Arrays.toString(item.getParameterTypes()));
        }
    }
}
