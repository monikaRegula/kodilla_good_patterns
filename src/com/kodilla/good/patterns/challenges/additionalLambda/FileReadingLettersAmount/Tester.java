package com.kodilla.good.patterns.challenges.additionalLambda.FileReadingLettersAmount;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toMap;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tester {


    public Map<Character,Integer> getFrequencyOfLetters(String s){
        String newS= s.toLowerCase();
        Map<Character, Integer> frequency = newS.toLowerCase().chars().boxed()
                .collect(toMap(
                        // key = char
                        k -> Character.valueOf((char) k.intValue()),
                        v -> 1,         // 1 occurence
                        Integer::sum)); // counting
        return  frequency;
    }


    public Map<String, Long> countWords() throws IOException {
    Pattern pattern = Pattern.compile("\\s+");

    Map<String,Long> countingWords = Files.lines(Paths.get("src\\exampleText"))
            .flatMap(line -> pattern.splitAsStream(line))
            .collect(Collectors.groupingBy(String::toLowerCase,
                    TreeMap::new, Collectors.counting()));


    countingWords.entrySet()
            .stream()
            .collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                    TreeMap::new,Collectors.toList()))
            .forEach((letter, wordList)-> {//tu mapować na stringa , collector join
                System.out.printf("%n%C%n",letter);
                wordList.stream().forEach(word -> System.out.printf("%10s: %d%n ",word.getKey(),word.getValue()));
            });
    return countingWords;
}


    public static void main(String[] args) throws IOException {



        String text = "Fal nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma faaal\n" +
                "Fal nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma faaal\n" +
                "Pięknie\n" +
                "Rozmawia się całkiem nieźle\n" +
                "I podoba nam dotychczas każdy obejrzany film\n" +
                "We mnie\n" +
                "Problem jest na pewno we mnie\n" +
                "Nie doszukuj się go w sobie\n" +
                "W tobie wszytko jest okej\n" +
                "Może dasz się znać po tym\n" +
                "Weź mnie znajdź potem\n" +
                "Dziś nie chce popłynąć bo…\n" +
                "Chętnie\n" +
                "Mogę złapać się za rękę\n" +
                "Jeśli chcesz wyrzucę każdy przeterminowany sos\n" +
                "A to śmieszne,\n" +
                "Nie rozumiem ciebie jeszcze\n" +
                "Pani mama chciała żebym więcej niż liceum miał\n" +
                "Ale daj się znać po tym\n" +
                "Gdzieś mnie znajdź potem\n" +
                "Dziś nie chcę popłynąć bo\n" +
                "Fal nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie\n" +
                "Fal nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie\n" +
                "Pewnie\n" +
                "Chciałbym ciebie słuchać więcej\n" +
                "Tylko skoczę w jedno miejsce\n" +
                "Potem może znajdę czas\n" +
                "Wcześniej\n" +
                "Spotykałem cię codziennie\n" +
                "Ale teraz kiedy muszę\n" +
                "Chętniej udałbym się spać\n" +
                "Proszę daj się znać po tym\n" +
                "Gdzieś mnie znajdź potem\n" +
                "Dziś nie popłyniemy bo\n" +
                "Fal nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie\n" +
                "Fal nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie ma fal\n" +
                "Nie\n";

        Tester t = new Tester();

        System.out.println(t.getFrequencyOfLetters(text));

        String s = String.valueOf(t.countWords())+t.getFrequencyOfLetters(text);
        FileWriter fileWriter = new FileWriter("src\\frequency");
        fileWriter.write(s);
        fileWriter.close();


    }
}
