package com.eomcs.lms;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import com.eomcs.lms.domain.Member;

public class ServerTest {
  static ObjectOutputStream out ;
  static ObjectInputStream in ;

  public static void main(String[] args) {



    try(Socket socket = new Socket("localhost",8888);
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream()) ;
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        
    
       
        
               
        ){
      System.out.println("서버와 연결됨");

      ServerTest.in = in;
      ServerTest.out =out;

      add(new Member(1,"홍길동"));
      add(new Member(2,"임꺽정"));
      list();

      out.writeUTF("okok");out.flush();
      System.out.println(in.readUTF());
      quit();


    }catch(Exception e) {
      e.printStackTrace();
    }


    System.out.println("서버와 연결 끊음 ");

  }

  static void add(Member member) throws Exception {
    out.writeUTF("add");
    out.writeObject(member);
    out.flush();
    System.out.println(in.readUTF());
  }
  static void list() throws Exception {
    out.writeUTF("list");out.flush();
    @SuppressWarnings("unchecked")
    List<Member> members =(List<Member>)in.readObject();
    for(Member m :members) {
      System.out.println(m);
    }
  }
  static void quit() throws Exception {
    out.writeUTF("quit");out.flush();
    System.out.println(in.readUTF());
  }
}
