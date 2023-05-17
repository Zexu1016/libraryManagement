package com.zexu.repository;

import com.zexu.repository.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookRepository {
    @Select("select * from tb_book where id = #{id}")
    Book selectById(Integer id);

    @Select("select * from tb_book")
    List<Book> selectAll();

    @Select("select * from tb_book limit #{start},#{number}")
    List<Book> selectPage(Integer start, Integer number);

    @Insert("insert into tb_book (type, name, description) VALUE (#{type}, #{name}, #{description})")
    void insert(Book book);

    @Delete("delete from tb_book where id = #{id}")
    void delete(Integer id);

    @Update("update tb_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    void update(Book book);



}
