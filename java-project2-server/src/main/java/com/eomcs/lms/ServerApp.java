package com.eomcs.lms;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.handler.Command;
import com.eomcs.util.DataSource;

public class ServerApp {



  ArrayList<ApplicationContextListener> listeners = new ArrayList<>();

  HashMap<String, Object> context = new HashMap<>();

  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);

  }

  public void service() throws Exception {


    try (ServerSocket ss = new ServerSocket(8888)) {



      for (ApplicationContextListener listener : listeners) {
        listener.contextInitialized(context);
      }


      System.out.println("서버실행중");
      while (true) {

        new RequestHandlerThread(ss.accept()).start();


      } // while


      /*
       * for (ApplicationContextListener listener : listeners) { listener.contextDestroyed(context);
       * }
       */

    } catch (Exception e) {
      e.printStackTrace();
    } // try(Serversocket)
  }



  public static void main(String[] args) throws Exception {
    ServerApp app = new ServerApp();

    app.addApplicationContextListener(new ApplicationInitializer());
    // App 을 실행한다.
    app.service();
  }
  // 바깥 클래스의 인스턴스 필드 사용한다면 inner ㅡㅋㄹ래스로 정의히라
  // inner 클래스 (non-static nested class

  class RequestHandlerThread extends Thread {

    Socket socket;

    public RequestHandlerThread(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {

      DataSource dataSource = (DataSource) context.get("dataSource");
      Connection con = dataSource.getConnection();
      try (Socket socket = this.socket;
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream())) {

        String request = in.readLine();



        Command commandHandler = (Command) context.get(request);
        if (commandHandler == null) {
          out.println("실행할수 없는 명령어입니다.");
          out.println("!end!");
          out.flush();
          return;
        }


        try {
          commandHandler.execute(in, out);
          con.commit();
        } catch (Exception e) {
          try {
            con.rollback();
          } catch (SQLException e1) {


          }
          out.printf("실행 오류! : %s\n", e.getMessage());
        }

        out.println("!end!");
        out.flush();


      } catch (Exception e) {



        System.out.println("명령어 실행 중 오류 발생 : " + e.toString());



      } finally {// try(socket)//
        dataSource.returnConnection(con);

      }
    }
  }


}
