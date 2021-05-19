package com.chuangke.controller;

import com.chuangke.entity.Student;
import com.chuangke.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/14 0014 9:58
 */
@Controller
public class StuController {

    @Autowired
    private IStuService stuService;

    @RequestMapping("queryAllStu")
    public String queryAllStu(ModelMap map){
        List<Student> studentList = stuService.queryAll();
        map.put("studentList",studentList);
        return "student";
    }
}
