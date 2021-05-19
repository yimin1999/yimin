package com.chuangke.service.impl;

import com.chuangke.dao.IBookTypeDao;
import com.chuangke.entity.BookType;
import com.chuangke.service.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:42
 */
@Service
public class IBookTypeServiceImpl implements IBookTypeService {

    @Autowired
    private IBookTypeDao bookTypeDao;

    @Override
    public List<BookType> queryAll() {
        return bookTypeDao.queryAll();
    }

    @Override
    public BookType queryById(int id) {
        return bookTypeDao.queryById(id);
    }
}
