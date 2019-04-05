package com.kodilla.good.patterns.challenges.Airlines;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Service service = new Service();
        service.getFlights();

        //znalezienie wszystkich lotów z podanego miasta
        System.out.println("Wyszukaj loty po miejscu startu (dostępne: Wrocław,Warszawa,Berlin,Paryż)");
        Scanner scanner = new Scanner(System.in);
        String from = scanner.next();
        service.showFlightsForm(from);
        //znalezienie wszystkich lotów do podanego miasta
        System.out.println("Wyszukaj po miejscu destynacji: ");
        String to = scanner.next();
        service.showFlightTo(to);

        //znalezienie wszystkich lotów do podanego miasta z mozliwością przesiadki
        System.out.println("Wyszukaj lotu z: ");
        from = scanner.next();
        System.out.println("Wyszukaj lotu do: ");
        to = scanner.next();
        System.out.println("Możliwość przesiadki: (wpisz true/false)");
        boolean change = Boolean.parseBoolean(scanner.next());
        service.showFlightsWithChange(from, to ,change);






    }
    }



