package com.ewm.netservice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public abstract class NetClient implements INetService {
    private Socket s;
    public NetClient(Socket socket){
        this.s = socket;
        //TODO
    }

    @Override
    public Socket getSocket() {
        return null;
    }

    @Override
    public void send(INetService obj, IMessage msg) {
        Socket o = obj.getSocket();
        try {
            OutputStream os = o.getOutputStream();
            os.write(msg.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onMessage(IMessage event) {

    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {

    }
}
