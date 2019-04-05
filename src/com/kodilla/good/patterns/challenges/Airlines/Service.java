package com.kodilla.good.patterns.challenges.Airlines;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class Service {

private List<Flight> flights;

    public Service() {
        Flight flight = new Flight("Wrocław","Berlin",true,150);
        Flight flight1 = new Flight("Wrocław","Warszawa",false,50);
        Flight flight2 = new Flight("Warszawa", "Paryż",false , 200);
        Flight flight3 = new Flight("Paryż","Wrocław",false,100);
        Flight flight4 = new Flight("Berlin","Frankfurt",false,300);
        Flight flight5 = new Flight("Warszawa", "Paryż",true , 200);
        Flight flight6 = new Flight("Paryż","Warszawa",true,100);
        Flight flight7 = new Flight("Berlin","Frankfurt",true,300);


        List<Flight> flights = new ArrayList<>();
        flights.add(flight);
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
        flights.add(flight7);


        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }



    public void showFlightsForm(String from){
                  flights.stream()
                .filter(n->n.getFrom().equals(from))
                .forEach(flight -> {
                    System.out.println(flight.toString()+"\n");
                });
    }


    public void showFlightTo(String to){
        flights.stream()
                .filter(p->p.getTo().equals(to))
        .forEach(f-> {
            System.out.println(f.toString()+"\n");
        });
    }


    public void showFlightsWithChange(String from,String to ,boolean by){

        flights.stream()
                .filter(a->a.getFrom().equals(from))
                .filter(b->b.getTo().equals(to))
                .filter(f-> f.getBy()==true)
                .forEach(s-> System.out.println(s.toString()+"\n"));
    }







}
