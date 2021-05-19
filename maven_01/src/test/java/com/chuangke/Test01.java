package com.chuangke;

import com.chuangke.entity.Student;
import com.chuangke.service.IStuService;
import com.chuangke.service.IStuServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/13 0013 10:35
 */
public class Test01 {
    IStuService service=new IStuServiceImpl();
    @Test
    public void demo1(){
        List<Student> students = service.queryAll();
        System.out.println(students);
    }
}
