package com.framework.springjava.controllers;

import com.framework.springjava.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(ModelMap model) {
        model.addAttribute("books",bookRepository.findAll());

        return "books/list";
    }
}
