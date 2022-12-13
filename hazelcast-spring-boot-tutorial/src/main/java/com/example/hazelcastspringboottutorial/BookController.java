package com.example.hazelcastspringboottutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{isbn}")
    public String getBookNameByIsbn(@PathVariable("isbn") String isbn) {
        long startTime = System.currentTimeMillis();
        String result = bookService.getBookNameByIsbn(isbn);
        long endTime = System.currentTimeMillis();
        result = result +" completed in: "+ (endTime - startTime)+"ms";
        return result;
    }
}
