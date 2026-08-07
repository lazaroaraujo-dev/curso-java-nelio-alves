import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. (agora) -> Data-hora:

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant ins01 = Instant.now();

        System.out.println("d01 = "+d01);
        System.out.println("d02 = " + d02);
        System.out.println("ins01 = " + ins01);

        // 2. Texto ISO 8601 -> Data-hora:

        LocalDate d03 = LocalDate.parse("2026-08-07");
        LocalDateTime d04 = LocalDateTime.parse("2026-08-07T15:12:00");
        Instant ins02 = Instant.parse("2026-08-07T18:30:00Z");
        Instant ins03 = Instant.parse("2026-08-07T18:30:00-03:00");

        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("ins02 = " + ins02);
        System.out.println("ins03 = "+ins03);//imprime o horario de londres mesmo armazenando o de são paulo

        // 3. Texto customizado -> Data-hora

        // 3.1 Formatacao:

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");// Só pra data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Para data e hora

        // 3.2 O método parse() pode receber dois argumentos (A data/hora e a formatação a considerar (DateTimeFormatter)):

        LocalDateTime d05 = LocalDateTime.parse("20/10/2026 20:00", fmt2);

        // 3.3 Instanciando passando os valores separadamente:
        LocalDate d06 = LocalDate.of(2026,12,20);
        LocalDateTime d07 = LocalDateTime.of(2026, 12, 20, 10, 12);

        System.out.println("d01 formatado = "+d01.format(fmt1));
        System.out.println("d05 = "+d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);


    }
}