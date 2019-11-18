package com.ewm.netservice;

public interface IMessage {
    //接口里不用写 final public static ,也是常量
    int REQ_VODE = 100;
    int REQ_LOGIN_RST = 200;
    int REQ_LOGIN_CST = 300;
    int REQ_LOGIN_RUR = 400;
    int getMsgType();
    byte[] getBytes();
}
