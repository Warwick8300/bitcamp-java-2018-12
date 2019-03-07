package design_pattern.proxy.after.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorSkel {

  public static void main(String[] args) {
    try (ServerSocket ss = new ServerSocket(8888)){
      System.out.println("서버실행중");

      
      Calculator calc = new CalculatorImpl();
      while(true) {
        try(Socket s = ss.accept();
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream())
            ){
          int a = in.readInt();
          int b = in.readInt();
          String op = in. readUTF();
          switch (op) {
            case "+":
              out.writeUTF("OK");
              out.writeInt(calc.plus(a, b)); break;
            case "-":
              out.writeUTF("OK");
              out.writeInt(calc.minus(a, b)); break;

            default:
              out.writeUTF("FAIL");
              out.writeUTF("해당 연산자를 지원하지 않스니다.");
          }
          

        }catch(Exception e) {
          System.out.println("클라이언트 요청 처리 중에 오류 발생!");
        }
      }



    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}