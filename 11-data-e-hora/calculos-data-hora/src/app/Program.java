package app;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        // CALCULOS BASICO COM DATA-HORA

        LocalDate localDate = LocalDate.parse("2024-04-11");
        LocalDateTime dateTime = LocalDateTime.parse("2024-04-11T01:30:26");
        Instant instantDate = Instant.parse("2024-04-11T01:30:26Z");

        LocalDate pastWeekLocalDate = localDate.minusDays(7); // 2024-04-04
        LocalDate nextWeekLocalDate = localDate.plusDays(7); // 2024-04-18

        System.out.println("Current local date: " + localDate);
        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
        System.out.println();

        LocalDateTime pastWeekLocalDateTime = dateTime.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = dateTime.plusDays(7);

        System.out.println("Current local date time: " + dateTime);
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
        System.out.println();

        Instant pastWeekInstant = instantDate.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = instantDate.plus(7, ChronoUnit.DAYS);

        System.out.println("Current Instant: " + dateTime);
        System.out.println("pastWeekInstant: " + pastWeekInstant);
        System.out.println("nextWeekInstant: " + nextWeekInstant);
        System.out.println();
        System.out.println("##########################################");
        System.out.println();

        // CALCULOS DE DURACAO

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), localDate.atStartOfDay()); // -> para usar com local date é necessário converter para local date time com .atStartOfDay()
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println();

        Duration t2 = Duration.between(pastWeekLocalDateTime, dateTime);
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println();

        Duration t3 = Duration.between(pastWeekInstant, instantDate); // 7
        Duration t4 = Duration.between(instantDate, pastWeekInstant); // -7
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
        System.out.println();


    }
}
