package com.ewm.demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class WMService implements Runnable {
    static ServerSocket server;
    static Socket socket;
    static Scanner sc = new Scanner(System.in);

    public WMService() {
        try {
            server = new ServerSocket(6883);
            System.out.println("服务器启动成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            socket = server.accept();
            System.out.println("有新用户接入！");
            while(true) {
                InputStream inputStream = socket.getInputStream();
                if(inputStream.available() > 0) {
                    System.out.println("开始接受消息了！");
                    ObjectInputStream ois = new ObjectInputStream(inputStream);
                    Message ms = (Message) ois.readObject();
                    System.out.println(ms.getMsg());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
/*    public static void onMessage(){
        while(true){

        }

    }*/

    public static void sendMessage(Message msg){
       try {
           System.out.println("可以发消息了");
           OutputStream outputStream = socket.getOutputStream();
           ObjectOutputStream oos = new ObjectOutputStream(outputStream);
           oos.writeObject(msg);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        WMService wmService = new WMService();
        new Thread(wmService).start();
        System.out.println("test Git!!!");
        System.out.println("test Git？？？？？？？？？？？？？？？？？？？++++");
        while(true) {
            String newMsg = sc.nextLine();
            Message message = new Message(newMsg);
            sendMessage(message);
        }
    }
}
