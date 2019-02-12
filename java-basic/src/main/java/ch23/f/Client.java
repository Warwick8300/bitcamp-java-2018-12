package ch23.f;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//Connection - Oriented vs Connection less
public class Client {
  
  public static void main(String[] args) {
    
    
    
    try(Socket socket = new Socket("www.kma.go.kr",80);
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())){
      
      out.println("GET / HTTP/1.1");
      out.println("Host: www.kma.go.kr");
     out.println("User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.96 Safari/537.36");
      out.println();
      out.flush();
      
      
      while(true) {
        System.out.println(in.nextLine());
      }
    
    }catch(Exception e){
      
    }
    
  }
 
}
