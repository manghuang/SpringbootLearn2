package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    private final List<Book>  books = new ArrayList<>();

    @PostMapping("/addBook")
    public ResponseEntity<List<Book>> addBook(@RequestBody Book book){
        books.add(book);
        return ResponseEntity.ok(books);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<List<Book>> deleteBook(@PathVariable("id") int id){
        books.remove(id);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/getBookByName")
    public ResponseEntity<List<Book>> getBookByName(@RequestParam("name") String name){
        List<Book> results = books.stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }


}
