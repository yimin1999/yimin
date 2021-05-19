package com.chuangke.controller;

import com.chuangke.entity.BookInfo;
import com.chuangke.entity.BookType;
import com.chuangke.service.IBookService;
import com.chuangke.service.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:50
 */
@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @Autowired
    private IBookTypeService typeService;

    @RequestMapping("queryBook")
    public String queryAllBook(ModelMap map, @RequestParam Map mapParam) {
        List<BookInfo> bookInfos = bookService.queryAll(mapParam);
        map.put("bookInfos", bookInfos);

        List<BookType> bookTypes = typeService.queryAll();
        map.put("bookTypes",bookTypes);

        map.put("condition",mapParam);
        return "p_list";
    }

    @RequestMapping("addBook")
    public String addBook(BookInfo info, MultipartFile file, HttpSession session){
        //获取真实路径
        String realPath = session.getServletContext().getRealPath("/images/book_img");
        //获取文件名字
        String filename = file.getOriginalFilename();
        //使用算法为文件名字生成一个唯一的文件名
        filename=filename.replace(filename.substring(0,filename.lastIndexOf(".")), UUID.randomUUID().toString());
        //把他放进对象的文件属性
        info.setImgurl(filename);
        //
        filename=realPath+filename;
        try {
            file.transferTo(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        bookService.addBook(info);
        return "redirect:queryBook";
    }
}
