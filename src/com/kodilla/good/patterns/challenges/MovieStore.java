package com.kodilla.good.patterns.challenges;

import java.rmi.MarshalledObject;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieStore {


    public Map<String,List<String>> getMovies(){

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny człowiek");
        ironManTranslations.add("Iron Man");


        List<String> avengersTranslatuons = new ArrayList<>();
        avengersTranslatuons.add("Mściciele");
        avengersTranslatuons.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");


        Map<String,List<String>> movieTitlesWithTranslations = new HashMap<>();
        movieTitlesWithTranslations.put("IM",ironManTranslations);
        movieTitlesWithTranslations.put("AV",avengersTranslatuons);
        movieTitlesWithTranslations.put("FL",flashTranslations);

        return movieTitlesWithTranslations;

    }


    public static void getTitleWithLoop(Map<String,List<String>> map){

        System.out.println("Solution with simple loop:");

        for (Map.Entry<String,List<String>> entry: map.entrySet()){
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.print(value+"! ");
        }
    }



    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String,List<String>> map = movieStore.getMovies();

        getTitleWithLoop(map);


        System.out.printf("%nSolution with lambda%n" );
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.print( pairs.getValue() + "!");
            it.remove(); // avoids a ConcurrentModificationException
        }


        //mapa> values> listy> pojedyncze filmy
       // map.values().stream().filter(




    }

}
