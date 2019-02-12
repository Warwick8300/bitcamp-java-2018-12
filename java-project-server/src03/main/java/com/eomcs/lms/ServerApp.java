package com.eomcs.lms;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
// 2단계 : 서버 
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
  public static void main(String[] args) {

    try(ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 시작");
      while(true) {

        try(Socket socket = serverSocket.accept();
            Scanner in = new Scanner(socket.getInputStream());
                PrintWriter out = new PrintWriter(socket.getOutputStream())){
          System.out.println("클라와 연결됨");
          
          String request = in.nextLine();
          out.println(request);
          out.flush();




        }catch(Exception e) {
          e.printStackTrace();
        }


        System.out.println("클라와 연결 끊음 ");
      }//while
    }catch( Exception e) {
      e.printStackTrace();
    }

  }
}
