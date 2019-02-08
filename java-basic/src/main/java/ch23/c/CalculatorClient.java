package ch23.c;
//계산기 클라이언트
/*
  실행 예:
  - 클라이언트가 계산기 서버에 접속 후

   계산기 서버에 오신 걸 환영합니다! <=== 서버의 응답
  계산식을 입력 하세요 ! <=== 서버의 응답
  예) 23 + 7 <=== 서버의 응답력
  > 23 + 7 <== 사용자의 입력 . '>' 문자는 클라이언트에서 출
  결과는 30 입니다. <=== 서버의 응답력
  >23 ^ 7
  ^연산자를 지원 하지 않습니다 식을 계산할 수 없습니다.
  >ok + yes
 > quit
 안녕히 가세요 
 */

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String[] args) {

    try (Socket socket = new Socket("localhost", 8888);
        // 문자열을 주고 받기 편하도록 오리지널 입출력 스트림 객체에 데코레이터를 붙인다.
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        Scanner keyboard = new Scanner(System.in)) {

      String input = null;
    while(in.hasNext()) {
     
      System.out.println(input);
        
      }
      System.out.print(">");
      out.println(keyboard.nextLine());
      out.flush(); // 스트림 객체의 내부 버퍼에 출력된 내용을 네트워크로 방출시킨다.
      System.out.println("서버에 데이터를 보냈음!");

      String response = in.nextLine();
      System.out.println(response);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
