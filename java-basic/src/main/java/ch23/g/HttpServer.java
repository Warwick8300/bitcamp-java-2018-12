package ch23.g;
//http 응답 규칙
//
//
//
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Connection - Oriented vs Connection less
public class HttpServer {

  public static void main(String[] args) {

    try(ServerSocket ss =new ServerSocket(8888)){
      System.out.println("서버실행중");
      while(true) {
        try(Socket socket = ss.accept();
            PrintStream out = new PrintStream(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream())){
          
          while(true) {
            String request = in.nextLine();
            System.out.println(request);
            if(request.length()==0)
              break;
          }

          out.println("HTTP/1.1 200 ok");
          out.println("Content-Type: text/html;charset=UTF-8");
          out.println();
          out.println("<html><body><h1>오로라! </h1></body></html>");
          out.flush();
        
        }catch(Exception e){
          e.printStackTrace();

        }
      }//while
    }catch(Exception e) {

    }
  }

}
