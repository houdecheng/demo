package com.sbdemo.demo.model;

/**
 * @Author hdc
 * @Date 2018/11/12 0012 11:33
 * @Version 1.0
 * @Description students表对应的实体类
 **/
public class Student {
    private int id;
    private String sname;
    private String sage;
    private String sgrade;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSgrade() {
        return sgrade;
    }

    public void setSgrade(String sgrade) {
        this.sgrade = sgrade;
    }

}
