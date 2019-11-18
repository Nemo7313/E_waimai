package com.ewm.netservice;

import java.net.Socket;

public interface INetService extends  Runnable{
    Socket getSocket();

    void send(INetService obj, IMessage msg);

    void onMessage(IMessage event);
}
