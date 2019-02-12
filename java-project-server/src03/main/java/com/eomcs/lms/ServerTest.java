package com.eomcs.lms;
import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class ServerTest {
  public static void main(String[] args) {



    try(Socket socket = new Socket("localhost",8888);
        Scanner in = new Scanner(socket.getInputStream());
        PrintWriter out = new PrintWriter(socket.getOutputStream())){
          System.out.println("서버와 연결됨");


          out.println("hello");
          out.flush();
          System.out.println(in.nextLine());

        }catch(Exception e) {
          e.printStackTrace();
        }


        System.out.println("서버와 연결 끊음 ");

  }
}
