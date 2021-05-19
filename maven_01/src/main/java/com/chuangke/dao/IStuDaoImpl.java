package com.chuangke.dao;

import com.chuangke.entity.Student;
import com.chuangke.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/13 0013 10:24
 */
public class IStuDaoImpl implements  IStuDao {

    @Override
    public List<Student> queryAll() {
        SqlSession session = MyBatisUtils.openSession(false);
        IStuDao stuDao = session.getMapper(IStuDao.class);
        return stuDao.queryAll();
    }
}
