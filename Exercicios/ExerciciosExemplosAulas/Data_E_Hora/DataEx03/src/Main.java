import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2026-05-10T20:30:00Z");

        // 1. Converter Instant para LocalDate (fuso de Portugal)
        LocalDate dPortugal = LocalDate.ofInstant(instant, ZoneId.of("Europe/Lisbon"));

        // 2. Converter Instant para LocalDateTime (fuso do Brasil)
        LocalDateTime dtBrasil = LocalDateTime.ofInstant(instant, ZoneId.of("America/Sao_Paulo"));

        // Imprimindo os objetos convertidos
        System.out.println("Data (Lisboa): " + dPortugal);
        System.out.println("Data e Hora (São Paulo): " + dtBrasil);
    }
}