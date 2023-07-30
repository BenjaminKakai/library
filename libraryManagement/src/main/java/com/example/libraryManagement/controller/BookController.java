package com.example.libraryManagement.controller;

import com.example.libraryManagement.service.BookService;
import com.example.libraryManagement.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    // Add more request handling methods as needed
}
