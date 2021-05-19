package com.chuangke.dao;

import com.chuangke.entity.BookType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:40
 */
public interface IBookTypeDao {

    @Select("select * from booktype")
    public List<BookType> queryAll();

    @Select("select * from booktype where btid=#{0}")
    public BookType queryById(int id);
}
