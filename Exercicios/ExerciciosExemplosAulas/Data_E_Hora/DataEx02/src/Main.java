import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Converta a data local 2026-10-15 para o formato brasileiro 15/10/2026.
        //Converta a data/hora local 2026-10-15T14:45:00 para o formato 15/10/2026 14:45.
        //Pegue um Instant referente a 2026-10-15T18:00:00Z e exiba-o formatado como dd/MM/yyyy HH:mm considerando o fuso horário do sistema (ZoneId.systemDefault()).

        DateTimeFormatter dataFormatation = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataLocal = LocalDate.parse("2026-10-15");

        System.out.println("Data modificada para formatação brasileira: "+ dataFormatation.format(dataLocal));

        DateTimeFormatter dataHoraFormatation = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraLocal = LocalDateTime.parse("2026-10-15T14:45:00");

        System.out.println("Data e hora no formato brasileiro: "+ dataHoraFormatation.format(dataHoraLocal));

        DateTimeFormatter formatterInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant instant = Instant.parse("2026-10-15T18:00:00Z");
        System.out.println("Data e hora com fuso horário local: "+formatterInstant.format(instant));
    }
}