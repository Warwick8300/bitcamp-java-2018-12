package com.eomcs.lms;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import com.eomcs.lms.domain.Member;

public class ServerTest {
  public static void main(String[] args) {



    try(Socket socket = new Socket("localhost",8888);
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())
       ){
          System.out.println("서버와 연결됨");

          Member member = new Member();
          member.setNo(1);
          member.setName("꺽정이");
          member.setEmail("bbb@text.com");
          member.setPassword("1111");
          member.setPhoto("hoh.gif");
          member.setTel("1111-1111");
       
         
          
          // Member 객체를 서버로 serialize하라!
          out.writeObject(member);
          out.flush();
          System.out.println("진입");
          // 또한 서버에서 serialize한 Member 객체를 받아라. 
        
        
          System.out.println( in.readObject());
          

        }catch(Exception e) {
          e.printStackTrace();
        }


        System.out.println("서버와 연결 끊음 ");

  }
}
