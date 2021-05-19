package com.chuangke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 17:25
 */
@Controller
public class PageController {

    @RequestMapping("page")
    public String page(String page){
        return page;
    }
}
