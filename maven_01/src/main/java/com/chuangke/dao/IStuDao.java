package com.chuangke.dao;

import com.chuangke.entity.Student;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/13 0013 10:23
 */
public interface IStuDao {

    @Select("SELECT * FROM `stu`")
    @ResultMap("stuMapper")
    public List<Student> queryAll();
}
