package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int userNum = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            int response = calculateFactorial(userNum);
            out.println("The factorial of " + userNum + " is: " + response);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static int calculateFactorial(int number){
        int fact = 1;
        for(int i=1;i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }
}
