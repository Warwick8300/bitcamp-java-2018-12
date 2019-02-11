
package ch23.e;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class CalculatorServer {
  public static void main(String[] args) {




    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");
      HashMap<String,Integer> session = new HashMap<String, Integer>();
      while (true) {
        try (Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());) {
          String name = in.readLine();
          System.out.println(name);
       
          if(name.equalsIgnoreCase("null")) {
            name = socket.getOutputStream().toString();   
            session.put(name, 0);
          }
          out.println(name);
          out.flush();
          
          
          System.out.println("클라이언트와 연결됨 요청처리중!");
          String[] input = in.readLine().split(" ");
          int result = session.get(name);

          String op = null;
          int b = 0;
          try {

            op = input[0];
            b = Integer.parseInt(input[1]);
          }catch (Exception e) {
            out.println("식의 형식이 바르지 않습니다.");
            out.flush();
            out.println(name);
            out.flush();
            continue;
          }


          switch (op) {
            case "+": result += b; break;
            case "-": result -= b; break;
            case "*": result *= b; break;
            case "/": result /= b; break;
            case "%": result %= b; break;
            default:
              out.printf("%s 연산자를 지원하지 않습니다.\n", op);
              out.flush();
              out.println(name);
              out.flush();
              
              continue;
          }

          
          out.printf("결과는 %d 입니다.\n", result);
          out.flush();
          session.put(name, result);
          
          
        }catch(Exception e) {
          System.out.println("클라이언트와 통신중 오류 발생 ");
          e.printStackTrace();
        }

        System.out.println("연결끊음");
      }//while

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
