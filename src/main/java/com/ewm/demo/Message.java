package com.ewm.demo;

import java.io.Serializable;

public class Message implements Serializable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Message(){};
    public Message(String msg) {
        this.msg = msg;
    }
}
