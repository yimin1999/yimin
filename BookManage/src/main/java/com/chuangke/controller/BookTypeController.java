package com.chuangke.controller;

import com.chuangke.entity.BookType;
import com.chuangke.service.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 20:45
 */
@Controller
public class BookTypeController {

    @Autowired
    private IBookTypeService typeService;

    @RequestMapping("queryType")
    public String queryAllType(ModelMap map){
        List<BookType> bookTypes = typeService.queryAll();
        map.put("bookTypes",bookTypes);
        return "p_add";
    }
}
