
package ch23.d;
//Stateful
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    try (Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream()))) {
      
      
      System.out.println("서버와 연결됨 ");
      while (true) {
        System.out.print("> ");
        String input = keyboard.nextLine();
        
        //서버에 요청할때 연결하고 


       
        out.println(input);
        out.flush();
        System.out.println("서버에서 계산작업을 요청함!");
        
        String response = in.readLine();
        System.out.println(response);
        if(input.equalsIgnoreCase("quit"))
          break;

      }//while
      
      System.out.println("서버와 연결 끊음");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    



    keyboard.close();
  }
}











