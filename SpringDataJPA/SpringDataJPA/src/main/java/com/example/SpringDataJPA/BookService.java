package com.example.SpringDataJPA;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //create book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    //find all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    //find book by id
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    //update book by id
    public Book updateBook(Long id, Book book) {
        Book res = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("book not found"));
        res.setName(book.getName());
        res.setAuthor(book.getAuthor());
        res.setPrice(book.getPrice());
        return res;
    }

    //delete book by id
    public void deleteById(Long id) {
        Book res = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("book not found"));
        bookRepository.deleteById(id);
    }
}
