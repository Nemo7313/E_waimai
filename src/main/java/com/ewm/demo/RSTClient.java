package com.ewm.demo;

import com.sun.corba.se.impl.io.OutputStreamHook;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class RSTClient implements Runnable {
    static Socket socket = null;
    static Scanner sc = new Scanner(System.in);

    public RSTClient() {
        try {
            socket = new Socket("127.0.0.1",6883);
            System.out.println("餐馆客户端启动成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while(true) {
                InputStream is = socket.getInputStream();
                if(is.available() > 0) {
                    System.out.println("开始接受消息了！");
                    ObjectInputStream ois = new ObjectInputStream(is);
                    Message message = (Message) ois.readObject();
                    System.out.println(message.getMsg());
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void sendMessage(Message msg){
        try {
            System.out.println("准备给服务器发消息啦");
            OutputStream os = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(msg);
            System.out.println("发送完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RSTClient rstClient = new RSTClient();
        new Thread(rstClient).start();
        while(true) {
            String newMsg = sc.nextLine();
            Message message = new Message(newMsg);
            sendMessage(message);
        }
    }
}
