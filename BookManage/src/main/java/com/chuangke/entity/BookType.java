package com.chuangke.entity;

import java.util.List;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:36
 */
public class BookType {
    private int btid;
    private String btname;

    private List<BookInfo> infoList;

    public BookType() {
    }

    public BookType(int btid, String btname, List<BookInfo> infoList) {
        this.btid = btid;
        this.btname = btname;
        this.infoList = infoList;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    public List<BookInfo> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<BookInfo> infoList) {
        this.infoList = infoList;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "btid=" + btid +
                ", btname='" + btname + '\'' +
                ", infoList=" + infoList +
                '}';
    }
}
