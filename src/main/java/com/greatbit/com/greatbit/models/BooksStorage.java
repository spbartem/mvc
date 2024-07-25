package com.greatbit.com.greatbit.models;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class BooksStorage {

    private static Set<Book> books = new HashSet<>();

    static {
        books.add(new Book(
                UUID.randomUUID().toString(),
                "Тёмная башня",
                "Стивен Кинг",
                5000));
        books.add(new Book(
                UUID.randomUUID().toString(),
                "Молитва об Оуэне Мини",
                "Джон Ирвинг",
                700));
        books.add(new Book(
                UUID.randomUUID().toString(),
                "Мастер и Маргарита",
                "Михаил Афанасьевич Булгаков",
                600));
    }

    public static Set<Book> getBooks() {
        return books;
    }
}
