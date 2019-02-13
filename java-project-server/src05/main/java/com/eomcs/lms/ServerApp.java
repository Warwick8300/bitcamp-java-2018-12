package com.eomcs.lms;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// 2단계 : 서버 
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import com.eomcs.lms.domain.Member;

public class ServerApp {

  static ObjectInputStream in ;
  static ObjectOutputStream out; 
  static ArrayList<Member> members = new ArrayList<Member>();
  public static void main(String[] args) {



    try(ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 시작");
      while(true) {

        try(Socket socket = serverSocket.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            
        
            ){
          System.out.println("클라와 연결됨");
          members.clear();
          ServerApp.in = in;
          ServerApp.out = out;
          loop:
            while(true) {
              String request =  in.readUTF();
              System.out.println(request);
              switch (request) {
                case "quit" :quit(); break loop;
                case "add" : add(); break;
                case "list" : list();break;
                default : out.writeUTF("이명령 처리불가");
              }
              out.flush();

            }//while


          /*
          // 클라이언트에서 serialize해서 보내온 Member 객체의 내용을 출력하라.
          Member member = (Member) in.readObject();

          // 그리고 즉시 클라이언트로 Member 객체를 serialize하여 보내라!
          out.writeObject(member);
          out.flush();


           */

        }catch(Exception e) {
          e.printStackTrace();
        }


        System.out.println("클라와 연결 끊음 ");
      }//while
    }catch( Exception e) {
      e.printStackTrace();
    }

  }


  static void quit() throws Exception {
    out.writeUTF("종료함");
    out.flush();

  }
  static void add() throws Exception{
    members.add((Member)in.readObject());
    out.writeUTF("ok"); 
  }
  static void list() throws Exception {
    out.writeObject(members);
  }
}
