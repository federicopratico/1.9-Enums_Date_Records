package Level1.Ex1;

import java.util.Arrays;

import static java.lang.System.out;

public class Main {
    public static void dayType(Day day) {
        if(day.getInteger() < 6) {
            out.println("Working day :(");
        }else{
            out.println("Holiday :)");
        }
    }

    public static void main(String[] args) {
        Day [] days = Day.values();
        Arrays.stream(days).forEach(day -> {
            out.print(day.name()+" ");
            dayType(day);
        });
    }
}
