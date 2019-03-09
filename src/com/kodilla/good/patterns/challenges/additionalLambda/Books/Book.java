package com.kodilla.good.patterns.challenges.additionalLambda.Books;

import com.kodilla.good.patterns.challenges.additionalLambda.Books.BookShelf;

import java.util.List;

public class Book {

    private String author;
    private String title;


    public Book(String author, String title) {
        this.author = author;
        this.title = title;

    }

    public String getAuthor() { return author; }

    public String getTitle() { return title; }

    public String toSting(){
        return  "Author: "+author + " Title: "+title  ;
    }

    String s = "";

    public String whereIsBook(BookShelf bookShelf, List<Book> books){
        if (bookShelf.getBooks().contains(this)){
           return "Book: "+title +s+author +s+s+s + "is laying on "+ bookShelf.getName();
        }else{
            return  "Book: "+title +s+author +s+s+s + "is not laying on any  bookshelf.";
        }

    }

}
