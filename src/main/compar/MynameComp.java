package main.compar;

import java.util.Comparator;

public class MynameComp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSurname().length() - o2.getSurname().length();
    }
}
