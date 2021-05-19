package com.chuangke.service;

import com.chuangke.dao.IStuDao;
import com.chuangke.dao.IStuDaoImpl;
import com.chuangke.entity.Student;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/13 0013 10:33
 */
public class IStuServiceImpl  implements IStuService{

    IStuDao dao=new IStuDaoImpl();

    @Override
    public List<Student> queryAll() {
        return dao.queryAll();
    }
}
