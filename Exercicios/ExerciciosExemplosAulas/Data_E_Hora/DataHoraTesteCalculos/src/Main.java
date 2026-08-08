import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Main {
    public static void main(String[] args) {
        // Instanciando um LocalDateTime com a data e||ou hora de um Instant
        // Ou seja, convertendo uma Data-hora Global para Data-hora local
        LocalDate d01 = LocalDate.parse("2025-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2025-07-20T15:00:26");
        Instant ins01 = Instant.parse("2025-07-20T01:00:26Z");

        LocalDate d03 = LocalDate.ofInstant(ins01, ZoneId.systemDefault());
        LocalDate d04 = LocalDate.ofInstant(ins01, ZoneId.of("Portugal"));
        LocalDateTime d05 = LocalDateTime.ofInstant(ins01, ZoneId.systemDefault());
        LocalDateTime d06 = LocalDateTime.ofInstant(ins01, ZoneId.of("Portugal"));

        System.out.println("d03 = "+ d03);
        System.out.println("d04 = "+ d04);
        System.out.println("d05 = "+ d05);
        System.out.println("d06 = "+ d06);

        // Obter dados de uma data-hora local - > dia, mês, ano, horário
        LocalDate d07 = LocalDate.parse("2026-08-08");
        LocalDateTime d08 = LocalDateTime.parse("2026-08-08T22:40:00");

        System.out.println("d07: dia -> "+d07.getDayOfMonth()+"| mês -> "+d07.getMonthValue()+"| ano -> "+d07.getYear());
        System.out.println("d08: dia -> "+d08.getDayOfMonth()+"| mês -> "+d08.getMonthValue()+"| ano -> "+d08.getYear());
        System.out.println("| hora -> "+d08.getHour()+"| minutos -> "+d08.getMinute()+"| segundos -> "+ d08.getSecond());


    }
}