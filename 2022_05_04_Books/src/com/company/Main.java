package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Pushkin", "Evgenij Onegin", 7.8, 20);
        Book book2 = new Book("Pushkin", "Pikovaja Dama", 6.3, 18);
        Book book3 = new Book("Lem", "Solaris", 9.34, 23);
        Book book4 = new Book("Bulgakov", "Master and Margarita", 19.00, 25);

        Book[] books = {book1, book2, book3, book4};
        Arrays.sort(books, new BookComparatorByRating());
        print(books);

        System.out.println("____LinkedList______");

        List<Book> bookList = new LinkedList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        System.out.println("get index 3"+bookList.get(3));
        System.out.println("size"+bookList.size());
        System.out.println(bookList);

        System.out.println("______for________");

        for (Book book:bookList) {
            System.out.println(book);

        }

    }



    public static void print(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}




