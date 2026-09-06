package com.example.SpringDataJPA;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //save book
    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    //get all books
    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    //get book by id
    @GetMapping("/getBookById/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    //update book my id
    @GetMapping("/updateBook/{id}")
    public ResponseEntity<Book> updateBookById(@PathVariable Long id, @RequestBody Book book) {
        try {
            Book res = bookService.updateBook(id, book);
            return ResponseEntity.ok(res);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    //delete book by id
    @PostMapping("/deleteBook/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable Long id) {
        try {
            bookService.getBookById(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
