package org.example;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            System.out.println("Client has started");
            Socket soc = new Socket("localhost", 8888);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
