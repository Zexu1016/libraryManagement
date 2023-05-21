package com.zexu.service;

import com.zexu.controller.request.PaginationDTO;
import com.zexu.repository.entity.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean delete(Integer id);
    Boolean update(Book book);

    Book selectById(Integer id);

    List<Book> selectAll();

    List<Book> selectPage(PaginationDTO paginationDTO);
}
