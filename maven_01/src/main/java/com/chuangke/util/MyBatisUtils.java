package com.chuangke.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Descrition:
 * mybatis的工具类
 * @Author yimin
 * @Date 2021/3/22 0022 14:13
 */
public class MyBatisUtils {
    private  static SqlSessionFactory factory;
    static{
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            factory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取SqlSession对象
     *
     * @param transaction ：需要事务传true，不需要传false
     * @return
     */
    public static SqlSession openSession(Boolean transaction){
        return factory.openSession(transaction);
    }
}
