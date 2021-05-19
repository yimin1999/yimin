package com.chuangke.entity;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/5/13 0013 10:07
 */
public class Student {
    private int sid;
    private String sname;
    private String sgender;
    private int sage;
    private String saddress;
    private String semail;

    public Student() {
    }

    public Student(int sid, String sname, String sgender, int sage, String saddress, String semail) {
        this.sid = sid;
        this.sname = sname;
        this.sgender = sgender;
        this.sage = sage;
        this.saddress = saddress;
        this.semail = semail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sgender='" + sgender + '\'' +
                ", sage=" + sage +
                ", saddress='" + saddress + '\'' +
                ", semail='" + semail + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }
}
