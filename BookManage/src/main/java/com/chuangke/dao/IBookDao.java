package com.chuangke.dao;

import com.chuangke.entity.BookInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:40
 */
public interface IBookDao {

    public List<BookInfo> queryAll(Map mapParam);

    @Insert("insert into bookinfo values(null,#{bname},#{price},#{type.btid},#{dtime},#{imgurl},#{state})")
    public void addBook(BookInfo info);
}
