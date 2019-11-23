package com.ewm.netservice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetServer implements INetService{
    private ServerSocket svr ;
    private List<Socket> clients;
    private boolean loop = true;
    private Map<Integer,NetClient> restaurants;
    private Map<Integer,NetClient> customers;
    private Map<Integer,NetClient> couriers;

    public NetServer(int port){
        try {
            svr = new ServerSocket(port);
            clients = new ArrayList<>();
            //HashMap线程不安全，可用ConcurrentHashMap<>()
            restaurants = new HashMap<>();
            customers = new HashMap<>();
            couriers = new HashMap<>();
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        do{
            //接受客户端连接
            try {
                Socket c= svr.accept();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }while(loop);
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

    public void sendMsgToRestaurant(int id, IMessage msg){
        NetClient restaurant = restaurants.get(id);
        if(null!=restaurant){
            send(restaurant,msg);
        }

    }


    @Override
    public void onMessage(IMessage event) {
        int msgType = event.getMsgType();
        switch(msgType){
            case IMessage.REQ_VODE:
                break;
            case IMessage.REQ_LOGIN_RST:
                break;
            case IMessage.REQ_LOGIN_CST:
                break;
            case IMessage.REQ_LOGIN_RUR:
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        NetServer server = new NetServer(5566);
        new Thread(server).start();
        System.out.println("外卖服务器启动成功！");
    }
}
