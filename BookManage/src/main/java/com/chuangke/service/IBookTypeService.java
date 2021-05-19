package com.chuangke.service;

import com.chuangke.entity.BookType;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:40
 */
public interface IBookTypeService {

    public List<BookType> queryAll();

    public BookType queryById(int id);
}
