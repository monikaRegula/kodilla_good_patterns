package com.kodilla.good.patterns.challenges.additionalLambda.Books;

import java.util.ArrayList;
import java.util.List;

public class BookTesting {
    public static void main(String[] args) {

        Book book1 = new Book("Mickiewicz","Pan Tadeusz");
        Book book2 = new Book("srgs,","srgze");
        Book book3  = new Book("ssr","segfaWHr");

        List<Book> books1 = new ArrayList<>();
        BookShelf bookShelf1 = new BookShelf("first",books1);
        bookShelf1.addToBookShelf(book1);
        bookShelf1.addToBookShelf(book2);


        int sum =bookShelf1.getBooks().size();
        bookShelf1.getInformation(sum);

        //int c =bookShelf1.getBooks().stream().distinct();


        // stream na obliczenie ilości ksiazek w liście



    }

}
