package ch23.test;
//stateless 클라이언트 만들기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//계산기 서버
public class CalculatorServer {
  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 연결중");


      while(true) {
        try (Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());) {



          String [] input = null ;
          int a = 0;
          String op= null;
          int b = 0;
          int result = 0;
          while(true) {
            try {
              String value = in.readLine();
              if(value.equalsIgnoreCase("quit")) {
                out.println("안녕히가세요");
                out.flush();
                break;
              }
            
              input = value.split(" ");
              a = Integer.parseInt(input[0]);
              op = input[1];
              b = Integer.parseInt(input[2]);
              
              
              switch (op) {
                case "+": result = a + b;break;
                case "-": result = a - b;break;
                case "%": result = a % b;break;
                case "/": result = a / b;break;
                case "*": result = a * b;break;

                default:
                  out.printf("%s 연산자를 지원하지 않습니다.\n",op);
                  out.flush();
                  continue;
                  
                  
              }
              out.printf("값은 %d 입니다\n",result);
              out.flush();
            }catch(Exception e){

              out.println("식의 형태가 잘못 되었습니다.");
              out.flush();
            }



          }

        }

      }
    } catch (IOException e) {
      // TODO 자동 생성된 catch 블록
      e.printStackTrace();
    }



  }






}
