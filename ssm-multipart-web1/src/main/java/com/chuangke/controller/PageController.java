package com.chuangke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/14 0014 9:57
 */
@Controller
public class PageController {

    @RequestMapping("page")
    public String getPage(String page){
        return page;
    }
}
