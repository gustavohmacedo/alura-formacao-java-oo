package br.com.alura.api_datas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        System.out.println("\n---------------------------Data de hoje-------------------------------------");
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("\n------------------------Data de Nascimento-----------------------------------");
        LocalDate birthDate = LocalDate.of(1988, Month.MAY, 16);
        System.out.println(birthDate);

        System.out.println("\n---------------------------------Idade---------------------------------------");
        int myAge = today.getYear() - birthDate.getYear();
        System.out.println(myAge);

        System.out.println("\n-----------------------------Idade detalhada---------------------------------");
        Period period = Period.between(today, birthDate);
        System.out.println(period);

        System.out.println("\n--------------------Formatando Data de Nascimento----------------------------");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yy");
        String valorFormatado = birthDate.format(formatador);
        System.out.println(valorFormatado);

        System.out.println("\n---------------------------Data-Hora-----------------------------------------");
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatadorHora));

        System.out.println("\n--------------------------------Hora-----------------------------------------");
        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

        System.out.println("\n---------------------------ZoneDataTime---------------------------------------");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println("\n-----------------------Teste LocaDate----------------------------------------");
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataFutura.format(formatter);
        System.out.println(dataFormatada);

        System.out.println("\n--------------------------Teste LocaDate-------------------------------------");
        LocalDate hoje = LocalDate.now();
        int tempoRestante = (dataFutura.getYear() - hoje.getYear());
        System.out.println("Faltam " + tempoRestante + " anos");
    }
}
