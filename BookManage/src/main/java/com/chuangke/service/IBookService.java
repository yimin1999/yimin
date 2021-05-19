package com.chuangke.service;

import com.chuangke.entity.BookInfo;

import java.util.List;
import java.util.Map;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:40
 */
public interface IBookService {

    public List<BookInfo> queryAll(Map mapParam);

    public void addBook(BookInfo info);
}
