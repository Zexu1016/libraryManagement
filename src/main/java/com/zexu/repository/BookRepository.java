package com.zexu.repository;

import com.zexu.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookRepository {
    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);

    public void save(Book book);
}
