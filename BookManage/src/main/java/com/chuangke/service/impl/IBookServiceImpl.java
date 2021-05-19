package com.chuangke.service.impl;

import com.chuangke.dao.IBookDao;
import com.chuangke.entity.BookInfo;
import com.chuangke.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:42
 */
@Service
public class IBookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<BookInfo> queryAll(Map mapParam) {
        return bookDao.queryAll(mapParam);
    }

    @Override
    public void addBook(BookInfo info) {
        bookDao.addBook(info);
    }
}
