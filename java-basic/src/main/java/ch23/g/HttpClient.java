package ch23.g;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//Connection - Oriented vs Connection less
public class HttpClient {
  
  public static void main(String[] args) {
    
    
    
    try(Socket socket = new Socket("localhsot",8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())){
      System.out.println("서버와 연결됨!");
      
      out.println("hello");
      System.out.println("데이터보냄");
      
      String response = in.nextLine();
      System.out.println("데이터받음");
      
      System.out.println(response);
    }catch(Exception e){
      
    }
    
  }
 
}
