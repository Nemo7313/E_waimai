package com.ewm.pojo;

import java.math.BigDecimal;

public class Customer {
    private long id;
    private String name;
    private String tel;
    private String addr;
    private BigDecimal total_consume;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public BigDecimal getTotal_consume() {
        return total_consume;
    }

    public void setTotal_consume(BigDecimal total_consume) {
        this.total_consume = total_consume;
    }
}
