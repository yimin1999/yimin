package com.chuangke.entity;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/14 0014 11:37
 */
public class BookType {

    private int bt_id;
    private String bt_name;

    private List<BookInfo> bookInfos;

    public BookType() {
    }

    public BookType(int bt_id, String bt_name, List<BookInfo> bookInfos) {
        this.bt_id = bt_id;
        this.bt_name = bt_name;
        this.bookInfos = bookInfos;
    }

    public int getBt_id() {
        return bt_id;
    }

    public void setBt_id(int bt_id) {
        this.bt_id = bt_id;
    }

    public String getBt_name() {
        return bt_name;
    }

    public void setBt_name(String bt_name) {
        this.bt_name = bt_name;
    }

    public List<BookInfo> getBookInfos() {
        return bookInfos;
    }

    public void setBookInfos(List<BookInfo> bookInfos) {
        this.bookInfos = bookInfos;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "bt_id=" + bt_id +
                ", bt_name='" + bt_name + '\'' +
                ", bookInfos=" + bookInfos +
                '}';
    }
}
