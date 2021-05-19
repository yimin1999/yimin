package com.chuangke.service.impl;

import com.chuangke.dao.IStuDao;
import com.chuangke.entity.Student;
import com.chuangke.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/13 0013 10:33
 */
@Service
public class IStuServiceImpl implements IStuService {

    @Autowired
    private IStuDao stuDao;

    @Override
    public List<Student> queryAll() {
        return stuDao.queryAll();
    }
}
