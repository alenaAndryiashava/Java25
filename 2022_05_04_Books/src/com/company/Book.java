package com.company;

public class Book {
    String author;
    String title;
    double price;
    int rating;

    public Book(String author, String title, double price, int rating) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("%s\"%s\" %5.2f [%d]",
                author,title, price, rating);
    }

    /*@Override
    public int compareTo(Book o) {
        return this.getAuthor().compareTo(o.getAuthor());
    }

     */
}
