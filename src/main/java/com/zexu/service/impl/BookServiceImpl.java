package com.zexu.service.impl;

import com.zexu.controller.request.PaginationDTO;
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
        book.setStatus("在架");
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

    @Override
    public List<Book> selectPage(PaginationDTO paginationDTO) {
        Integer currentPage = paginationDTO.getCurrentPage();
        Integer pageSize = paginationDTO.getPageSize();
        return bookRepository.selectPage((currentPage - 1) * pageSize, currentPage * pageSize);
    }
}
