package com.skills.treeofskills.controller;

import com.skills.treeofskills.model.Book;
import com.skills.treeofskills.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AuthhController {

    private BookService bookService;
    @Autowired
    public AuthhController(BookService bookService) {
        this.bookService = bookService;
    }

    /*---Add new book---*/
    @PostMapping("/book")
    public ResponseEntity<?> save(@RequestBody Book book) {
        long id = bookService.save(book);
        return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
    }

    /*---Get a book by id---*/
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> get(@PathVariable("id") long id) {
        Book book = bookService.get(id);
        return ResponseEntity.ok().body(book);
    }

    /*---get all books---*/
    @GetMapping("/book")
    public ResponseEntity<List<Book>> list() {
        List<Book> books = bookService.list();
        return ResponseEntity.ok().body(books);
    }

    /*---Update a book by id---*/
    @PutMapping("/book/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book) {
        bookService.update(id, book);
        return ResponseEntity.ok().body("Book has been updated successfully.");
    }

    /*---Delete a book by id---*/
    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        bookService.delete(id);
        return ResponseEntity.ok().body("Book has been deleted successfully.");
    }
    @RequestMapping("/login")
    public ResponseEntity<?> sayHello() {

        return ResponseEntity.ok().body("New Book has been saved with ID:");
    }
}
