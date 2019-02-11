
package ch23.d;
//Stateful
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer2 {
  public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");

      while (true) {
        try (Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());) {
          System.out.println("클라이언트와 연결됨!");

          while(true) {
            String request =  in.readLine();
            
            System.out.println("요청처리함");
            String[] input = request.split(" ");
            if(request.equalsIgnoreCase("quit")) {
              out.println("잘가라우");
              out.flush();
              break;
            }


            int a  =0;
            String op = null;
            int b = 0;

            try {
              a = Integer.parseInt(input[0]);
              op = input[1];
              b = Integer.parseInt(input[2]);
            }catch (Exception e) {
              out.println("식의 형식이 바르지 않습니다.");
              out.flush();
              continue;
            }



            int result = 0;

            switch (op) {
              case "+": result = a + b; break;
              case "-": result = a - b; break;
              case "*": result = a * b; break;
              case "/": result = a / b; break;
              case "%": result = a % b; break;
              default:
                out.printf("%s 연산자를 지원하지 않습니다.\n", op);
                out.flush();
                continue;
            }

            out.printf("결과는 %d 입니다.\n", result);
            out.flush();
          }//while
        }catch(Exception e) {
          System.out.println("클라이언트와 통신중 오류 발생 ");
        }

        System.out.println("연결끊음");
      } //while

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
