package ch23.f;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Connection - Oriented vs Connection less
public class Server {

  public static void main(String[] args) {

    try(ServerSocket ss =new ServerSocket(8888)){

      while(true) {
        try(Socket socket = ss.accept();
            PrintStream out = new PrintStream(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream())){
          System.out.println("클라이언트와 연결");

          String request = in.nextLine();

          System.out.println("**" + request + "**");
          System.out.println("데이터보넴");
        }catch(Exception e){
          e.printStackTrace();

        }
      }//while
    }catch(Exception e) {

    }
  }

}
