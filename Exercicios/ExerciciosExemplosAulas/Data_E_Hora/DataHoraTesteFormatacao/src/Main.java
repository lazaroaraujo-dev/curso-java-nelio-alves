import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Documentation: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        LocalDate d01 = LocalDate.parse("2026-12-20");
        LocalDateTime d02 = LocalDateTime.parse("2026-10-20T16:05:30");
        Instant ins01 = Instant.parse("2026-10-20T16:05:20-03:00");
        OffsetDateTime odt = OffsetDateTime.parse("2026-10-20T16:05:20-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.RFC_1123_DATE_TIME.withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME.withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
        DateTimeFormatter fmt8 = DateTimeFormatter.ISO_TIME;
        DateTimeFormatter fmt9 = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter fmt10 = DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter fmt11 = DateTimeFormatter.ISO_ZONED_DATE_TIME.withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt12 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter fmt13 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter fmt14 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter fmt15 = DateTimeFormatter.ISO_OFFSET_DATE;
        DateTimeFormatter fmt16 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        DateTimeFormatter fmt17 = DateTimeFormatter.ISO_OFFSET_TIME;

        System.out.println("d01 = " + d01.format(fmt1)); // 20/12/2026
        System.out.println("d02 = " + d02.format(fmt2)); // 20/10/2026 16:05:30
        System.out.println("ins01 = " + fmt3.format(ins01)); // 20/10/2026 16:05:20
        System.out.println("inst01 ISO_DATE_TIME: "+ fmt4.format(ins01)); // Tue, 20 Oct 2026 16:05:20 -0300
        System.out.println("d01 = "+ fmt5.format(d01));// Resultado: 2026-12-20
        System.out.println("ins01 = "+ fmt6.format(ins01));
        System.out.println("ins01 = "+ fmt7.format(ins01));
        System.out.println("d02 = "+ fmt8.format(d02));
        System.out.println("d01 = "+ fmt9.format(d01));
        System.out.println("d02 = "+ fmt10.format(d02));
        System.out.println("ins01 = "+ fmt11.format(ins01));
        System.out.println("d01 = "+ fmt12.format(d01));
        System.out.println("d02 = "+ fmt13.format(d02));
        System.out.println("d02 = "+ fmt14.format(d02));
        System.out.println("odt = "+ fmt15.format(odt));
        System.out.println("odt = "+ fmt16.format(odt));
        System.out.println("odt = "+ fmt17.format(odt));
    }
}