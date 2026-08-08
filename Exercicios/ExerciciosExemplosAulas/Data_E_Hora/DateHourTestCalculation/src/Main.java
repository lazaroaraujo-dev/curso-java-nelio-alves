import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Calculos com Data-Hora +/- tempo -> Data-Hora
        LocalDate d01 = LocalDate.parse("2026-08-08");
        LocalDateTime d02 = LocalDateTime.parse("2026-08-08T22:56:00");
        Instant ins01 = Instant.parse("2026-08-08T22:56:00Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate: "+ pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: "+ nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("pastWeekLocalDateTime: "+pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: "+nextWeekLocalDateTime);

        Instant pastWeekInstant = ins01.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = ins01.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant: "+pastWeekInstant);
        System.out.println("nextWeekInstant: "+nextWeekInstant);

        // Duracao
        Duration drt1 = Duration.between(pastWeekLocalDateTime, d02);
        Duration drt2 = Duration.between(pastWeekInstant, ins01);
        Duration drt3 = Duration.between(pastWeekLocalDate.atTime(0,0), d01.atTime(0,0));
        Duration drt4 = Duration.between(pastWeekInstant, ins01);
        Duration drt5 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());

        System.out.println("drt1 = "+drt1.toDays());
        System.out.println("drt2 = "+drt2.toDays());
        System.out.println("drt3 = "+drt3.toDays());
        System.out.println("drt4 = "+drt4.toDays());
        System.out.println("drt5 = "+drt5.toDays());


    }
}