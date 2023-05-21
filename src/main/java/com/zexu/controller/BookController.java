package com.zexu.controller;

import com.zexu.controller.request.PaginationDTO;
import com.zexu.controller.response.LMResult;
import com.zexu.repository.entity.Book;
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
    public LMResult<List<Book>> getAll() {
        return LMResult.success(bookService.selectAll());
    }

    @GetMapping("/get/{id}")
    public LMResult<Book> getById(@PathVariable Integer id) {
        return LMResult.success(bookService.selectById(id));
    }

    @GetMapping("/delete/{id}")
    public LMResult<Boolean> delete(@PathVariable Integer id) {
        bookService.delete(id);
        return LMResult.success(true);
    }

    @GetMapping("/borrow/{id}")
    public LMResult<Boolean> borrow(@PathVariable Integer id) {
        Book book = bookService.selectById(id);
        book.setStatus("借出");
        bookService.update(book);
        return LMResult.success(true);
    }

    @GetMapping("/returned/{id}")
    public LMResult<Boolean> returned(@PathVariable Integer id) {
        Book book = bookService.selectById(id);
        book.setStatus("在架");
        bookService.update(book);
        return LMResult.success(true);
    }

    @PostMapping("/save")
    public LMResult<Boolean> save(@RequestBody Book book) {
        bookService.save(book);
        return LMResult.success(true);
    }

    @PostMapping("/update")
    public LMResult<Boolean> update(@RequestBody Book book) {
        bookService.update(book);
        return LMResult.success(true);
    }

    @PostMapping("/getPage")
    public LMResult<List<Book>> getPage(@RequestBody PaginationDTO paginationDTO) {

        return LMResult.success(bookService.selectPage(paginationDTO));
    }



}
