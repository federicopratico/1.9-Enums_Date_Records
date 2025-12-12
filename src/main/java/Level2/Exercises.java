package Level2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercises {

    public static void ifpassed(LocalDateTime date) {
        if(date.isBefore(LocalDateTime.now()))
            System.out.println("the day " + date + " is in the past");
        else System.out.println("the day " + date + " is in the future");
    }
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        /* Ex 1 */
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Local date: " + localDate);
        System.out.println("Local time: " + localTime);
        System.out.println("Local date time: " + df.format(localDateTime));

        /* Ex 2 */
        System.out.println("PERDIOD AND DURATION DIFFERENCE CALCULATION");
        LocalDate onePastDay = LocalDate.of(2015,5,8);
        LocalDateTime oneFutureMoment = LocalDateTime.of(2030, 3,6,13,50);

        Period p = Period.between(onePastDay, localDate);
        System.out.println("From " + onePastDay + " to " + localDate + " passed " + p.getYears() +  " years and " + p.getMonths() + " months and " + p.getDays() + " days");

        Duration d = Duration.between(localDateTime, oneFutureMoment);
        System.out.println("Hours: " + d.toHours());
        System.out.println("Minutes: " + d.toMinutes());
        System.out.println("Seconds: " + d.getSeconds());
        System.out.println();

        /* Ex 3 */
        System.out.println("Adding 1 month and 5 days");
        System.out.println(localDate.plusMonths(1).plusDays(5));

        System.out.println();

        System.out.println("Resting 1 month and 5 days");
        System.out.println(localDate.minusMonths(1).minusDays(5));
        System.out.println();
        /* Ex 5 */
        ifpassed(oneFutureMoment);
    }
}
