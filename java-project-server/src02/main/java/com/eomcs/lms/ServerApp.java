package com.eomcs.lms;
// 2단계 : 서버 
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
  public static void main(String[] args) {

    try(ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 시작");
      while(true) {

        try(Socket socket = serverSocket.accept()){
          System.out.println("클라와 연결됨");




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
