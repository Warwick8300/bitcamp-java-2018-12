package com.eomcs.lms;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// 2단계 : 서버 
import java.net.ServerSocket;
import java.net.Socket;
import com.eomcs.lms.domain.Member;

public class ServerApp {
  public static void main(String[] args) {

    try(ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 시작");
      while(true) {

        try(Socket socket = serverSocket.accept();
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())){
          System.out.println("클라와 연결됨");
          
          // 클라이언트에서 serialize해서 보내온 Member 객체의 내용을 출력하라.
          Member member = (Member) in.readObject();
        
          // 그리고 즉시 클라이언트로 Member 객체를 serialize하여 보내라!
          out.writeObject(member);
          out.flush();
          



        }catch(Exception e) {
          e.printStackTrace();
        }


        System.out.println("클라와 연결 끊음 ");
      }//while
    }catch( Exception e) {
      e.printStackTrace();
    }

  }
}
