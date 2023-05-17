package com.zexu.service.impl;

import com.zexu.repository.entity.Book;
import com.zexu.repository.BookRepository;
import com.zexu.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Boolean save(Book book) {
        bookRepository.insert(book);
        return true;
    }

    @Override
    public Boolean delete(Integer id) {
        bookRepository.delete(id);
        return true;
    }

    @Override
    public Boolean update(Book book) {
        bookRepository.update(book);
        return true;
    }

    @Override
    public Book selectById(Integer id) {
        return bookRepository.selectById(id);
    }

    @Override
    public List<Book> selectAll() {
        return bookRepository.selectAll();
    }
}
