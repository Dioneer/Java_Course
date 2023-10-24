package main.enaum;

public enum DaysOfWeek {
    Sunday("bad"),
    Monday("bad"),
    Tuesday("so-so"),
    Wednesday("so-so"),
    Thursday("greate"),
    Friday("greate"),
    Saturday("good");
    private String mood;

    private DaysOfWeek(String mood) {
        this.mood = mood;
    }
    public String getMood(){
        return mood;
    }
}
