package com.pioterDeveloper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        int clientNum = 1;
	    try(ServerSocket serverSocket = new ServerSocket(5000)){
	        while(true) {
                new Echoer(serverSocket.accept(), clientNum).start();
                clientNum++;
            }
        }catch(IOException e){
            System.out.println("Server exception " + e.getMessage());
        }
    }
}
