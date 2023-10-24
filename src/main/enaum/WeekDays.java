package main.enaum;

public class WeekDays {
    public String dayInfo(int num){
        String t = null;
        switch (DaysOfWeek.values()[num]){
            case Monday ->  t = "Monday";
            case Thursday -> t = "Thursday";
            case Wednesday -> t = "Wednesday";
            case Tuesday -> t = "Tuesday";
            case Friday -> t = "Friday";
            case Saturday-> t = "Saturday";
            case Sunday -> t = "Sunday";
        }
        return t+" - "+DaysOfWeek.values()[num].getMood();
    }
}
