package com.zexu.repositoryTest;

import com.zexu.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;
    @Test
    void selectByIdTest() {
        System.out.println(bookRepository.getById(5));
    }
}
