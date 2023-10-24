package main.enaum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void dayOfW(String dayOfWeek){
        System.out.println("Day of week - " + dayOfWeek);
    }

    public static void main(String[] args) {
        WeekDays weekDays = new WeekDays();
        dayOfW(weekDays.dayInfo(5));
        List<DaysOfWeek> arr = Arrays.asList(DaysOfWeek.values());
        System.out.println(arr);
    }
}
