package com.ewm.netservice.message;


import com.ewm.netservice.IMessage;

public class RequestVCodeMsg implements IMessage {
    private String phone;
    private int msgType;
    public RequestVCodeMsg(String pn){
        this.phone = pn;
        msgType = IMessage.REQ_VODE;
    }
    @Override
    public int getMsgType() {
        return IMessage.REQ_VODE;
    }

    @Override
    public byte[] getBytes() {
        return new byte[0];
    }
}
