package com.zexu.controller;

import com.zexu.entity.Book;
import com.zexu.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @GetMapping("/get")
    public List<Book> getAll() {
        return bookService.selectAll();
    }

    @GetMapping("/get/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.selectById(id);
    }

    @GetMapping("/delete/{id}")
    public Boolean delete(@PathVariable Integer id) {
        bookService.delete(id);
        return true;
    }

    @PostMapping("/save")
    public Boolean save(@RequestBody Book book) {
        bookService.save(book);
        return true;
    }

    @PostMapping("/update")
    public Boolean update(@RequestBody Book book) {
        bookService.update(book);
        return true;
    }




}
