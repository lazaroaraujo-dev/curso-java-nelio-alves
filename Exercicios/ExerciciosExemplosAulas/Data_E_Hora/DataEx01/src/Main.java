import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Parte 1: Data de hoje(momento) e registro de uma data.
        LocalDate dataHoje = LocalDate.now();
        System.out.println("Data de hoje: "+dataHoje);

        LocalDate data = LocalDate.parse("2025-07-20");
        System.out.println("Data último login:  "+data); //último login é um exemplo de onde é aplicado

        // Data e hora do momento específico e registro de uma data e hora.
        LocalDateTime actualLocalDateTime = LocalDateTime.now();
        System.out.println("Data e hora atual: "+actualLocalDateTime);

        LocalDateTime localDateTime = LocalDateTime.parse("2025-07-20T15:30:00");
        System.out.println("Data e hora última atualização: "+localDateTime);

        Instant instant = Instant.now();
        System.out.printf("Data e hora global(UTC) %s\n", instant);

        Instant instant1 = Instant.parse("2025-07-20T18:30:00Z");
        System.out.println("Data e hora Padrão ISO 8601 UTC: "+ instant1);


    }
}