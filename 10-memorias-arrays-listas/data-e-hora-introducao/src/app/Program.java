package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // Instanciar uma data com .now()
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        // Obse: ao fazer o print de um objeto date, fica implicido o método .toString()
        // para o caso abaixo, é o mesmo que fazer d01.toString();

        System.out.println("LocalDate: " + d01); // -> YYYY-MM-DD
        System.out.println("LocalDateTime: " + d02); // -> YYYY-MM-DDTHH:MM:SS.SSSSSSSSS
        System.out.println("Instant (GMT/UTC): " + d03); // -> YYYY-MM-DDTHH:MM:SS.SSSSSSSSS
        System.out.println("------------------");

        //Instanciar uma data a partir de um Texto ISO 8601 -> Data-hora
        LocalDate d04 = LocalDate.parse("2024-04-11");
        LocalDateTime d05 = LocalDateTime.parse("2024-04-11T01:30:26");
        Instant d06 = Instant.parse("2024-04-11T01:30:26Z");
        Instant d07 = Instant.parse("2024-04-11T01:30:26-03:00"); // nese caso o valor será convertido para o timezone GMT considerando -3 como timezone de origem

        System.out.println("LocalDate.parse: " + d04); // -> YYYY-MM-DD
        System.out.println("LocalDateTime.parse: " + d05); // -> YYYY-MM-DDTHH:MM:SS
        System.out.println("Instant.parse: " + d06); // -> YYYY-MM-DDTHH:MM:SSZ
        System.out.println("Instant.parse: " + d07); // -> YYYY-MM-DDTHH:MM:SSZ
        System.out.println("Instant.parse: " + d07); // -> YYYY-MM-DDTHH:MM:SSZ
        System.out.println("------------------");

        // Texto no formato customizado -> Data-hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("11/04/2024", fmt1); // -> 2024-04-11
        LocalDateTime d09 = LocalDateTime.parse("11/04/2024 01:30", fmt2); // -> 2024-04-11T01:30

        System.out.println(d08);
        System.out.println(d09);
        System.out.println("------------------");

        // Dia, mes ano [horario] -> Data-hora local

        LocalDate d10 = LocalDate.of(2024, 4, 11);
        LocalDateTime d11 = LocalDateTime.of(2024, 4, 11, 1, 30);

        System.out.println("LocalDate.of: " + d10); // 2024-04-11
        System.out.println("LocalDateTime.of: " + d11); //2024-04-11T01:30
        System.out.println("------------------");

        // Convertendo Data-hora para texto

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // -> Date  Local
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // -> Date time local
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Instand. ZoneId.systemDefault() -> retorna o fuso horario da maquina local

        System.out.println("Sem formatacao: " + d04);
        System.out.println("Formato customizado: " + d04.format(fmt3));
        System.out.println("Formato customizado: " + fmt3.format(d04));

        System.out.println("------------------");
        System.out.println("Sem formatacao: " + d05);
        System.out.println("Formato customizado: " + d05.format(fmt4));

        System.out.println("------------------");
        System.out.println("Sem formatacao: " + d06);
        System.out.println("Formato customizado: " + fmt5.format(d06));

        System.out.println("------------------");
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Formato customizado com ISO_DATE_TIME: " + d05.format(fmt6));
        DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("Formato customizado com ISO_INSTANT: " + fmt7.format(d06));


    }
}
