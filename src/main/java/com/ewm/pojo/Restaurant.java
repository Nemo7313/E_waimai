package com.ewm.pojo;

public class Restaurant {
    private int id;
    private String name;
    private String addr;
    private String tel;
    private String notes;
    private short isQingZhen;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public short getIsQingZhen() {
        return isQingZhen;
    }

    public void setIsQingZhen(short isQingZhen) {
        this.isQingZhen = isQingZhen;
    }
}
