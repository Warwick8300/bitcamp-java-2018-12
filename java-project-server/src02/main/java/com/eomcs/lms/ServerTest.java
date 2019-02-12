package com.eomcs.lms;
import java.net.Socket;

public class ServerTest {
  public static void main(String[] args) {



    try(Socket socket = new Socket("localhost",8888)){
      System.out.println("서버와 연결됨");




    }catch(Exception e) {
      e.printStackTrace();
    }


    System.out.println("서버와 연결 끊음 ");

  }
}
