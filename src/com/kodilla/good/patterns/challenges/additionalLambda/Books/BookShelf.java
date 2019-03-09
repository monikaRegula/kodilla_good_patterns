package com.kodilla.good.patterns.challenges.additionalLambda.Books;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {

    private String name;
    private List<Book> books = new ArrayList<>();

    public BookShelf(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() { return name; }

    public List<Book> getBooks() { return books; }

    public List<Book> addToBookShelf(Book book){
        books.add(book);
        return books;
    }

    public void getInformation(int amount){
        System.out.println("Bookshelf:" +name + " there are "+amount +" books. " + books.toString());
    }
}
