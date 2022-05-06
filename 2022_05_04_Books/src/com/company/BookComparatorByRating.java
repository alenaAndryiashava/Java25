package com.company;

import java.util.Comparator;

public class BookComparatorByRating implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getRating()-book2.getRating();
    }
}
