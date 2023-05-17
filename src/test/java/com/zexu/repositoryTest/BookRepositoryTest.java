package com.zexu.repositoryTest;

import com.zexu.repository.entity.Book;
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
        System.out.println(bookRepository.selectById(5));
    }

    @Test
    void selectAllTest() {
        System.out.println(bookRepository.selectAll());
    }
    @Test
    void insertTest() {
        Book book = new Book();
        book.setName("最新出炉！");
        book.setDescription("测试一下能不能成功插入");
        book.setType("测试");
        bookRepository.insert(book);
        System.out.println(bookRepository.selectAll());
    }
    @Test
    void deleteTest() {
        bookRepository.delete(8);
        System.out.println(bookRepository.selectAll());
    }
    @Test
    void updateTest() {
        Book book = new Book();
        book.setId(8);
        book.setDescription("测试一下能不能成功更新");
        bookRepository.update(book);
        System.out.println(bookRepository.selectAll());
    }
    @Test
    void selectPageTest() {
        System.out.println(bookRepository.selectPage(1,3));
    }

}
