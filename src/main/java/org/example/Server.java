package org.example;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            System.out.println("Server has started....");
            System.out.println("Waiting for clients to join");
            ServerSocket ssocket = new ServerSocket(8888);
            Socket soc = ssocket.accept();
            System.out.println("A client has connected and connection has been established");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
