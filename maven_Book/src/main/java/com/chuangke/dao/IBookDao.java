package com.chuangke.dao;

import com.chuangke.entity.BookInfo;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/14 0014 11:32
 */
public interface IBookDao {

    //查询所有
    public List<BookInfo> queryAll();
}
