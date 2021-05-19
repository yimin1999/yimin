package com.chuangke.entity;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/17 0017 18:28
 */
public class BookInfo {
    private int bid;
    private String bname;
    private String price;
    private BookType type;
    private String dtime;
    private String imgurl;
    private int state;

    public BookInfo() {
    }

    public BookInfo(int bid, String bname, String price, BookType type, String dtime, String imgurl, int state) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.type = type;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", price='" + price + '\'' +
                ", type=" + type +
                ", dtime='" + dtime + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", state=" + state +
                '}';
    }
}
