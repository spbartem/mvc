package com.greatbit.controllers;

import com.greatbit.com.greatbit.models.Book;
import com.greatbit.com.greatbit.models.BooksStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooksController {

    @GetMapping("/listofbooks")
    public String listOfBooks(Model model) {
        List<Book> listOfBooks = BooksStorage.getBooks()
                .stream()
                .toList();
        model.addAttribute("listOfBooks", listOfBooks);
        return "books";
    }
}
