package ch23.c;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//계산기 서버
public class CalculatorServer {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("클라이언트의 연결을 기다리고 있음.");

      try (
          Socket socket = serverSocket.accept();
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          Scanner in = new Scanner(socket.getInputStream())) {

        out.write("  계산기 서버에 오신 걸 환영합니다!\n" + 
            "  계산식을 입력 하세요 !\n" + 
            "  예) 23 + 7 \n");
        out.write("");
        out.flush();
        String request = in.nextLine(); 
       
        System.out.println( request.substring(request.lastIndexOf("+")+1));

        System.out.print("데이터를 보내기 전에 잠깐!");
        keyboard.nextLine();

        out.write("**" + request + "**");
        out.flush();
        System.out.println("클라인트에게 데이터를 보냈음.");

      }
      System.out.println("클라이언트와의 연결을 끊었음.");

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}
