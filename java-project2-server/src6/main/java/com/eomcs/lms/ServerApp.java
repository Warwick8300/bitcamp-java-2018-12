package com.eomcs.lms;
// 4단계 : command 를 미리 구현한 
// 클라이언트와 데이트를 주고 받는 것을 좀더 쉽게하기 위해 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.handler.Command;

public class ServerApp {



  ArrayList<ApplicationContextListener> listeners = new ArrayList<>();


  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);

  }

  public void service() throws Exception {


    try (ServerSocket ss = new ServerSocket(8888)) {

      HashMap<String, Object> context = new HashMap<>();



      for (ApplicationContextListener listener : listeners) {
        listener.contextInitialized(context);
      }


      System.out.println("서버실행중");
      while (true) {

        try (Socket socket = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream())) {

          String request = in.readLine();
          if (request.equalsIgnoreCase("stop")) {
            System.out.println("서버를 종료합니다.");
            break;

          }


          Command commandHandler = (Command)context.get(request);
          if (commandHandler == null) {
            out.println("실행할수 없는 명령어입니다.");
            out.println("!end!");
            out.flush();
            continue;
          }
          commandHandler.execute(in,out);
          out.println("!end!");
          out.flush();


        } catch (Exception e) {
          System.out.println("명령어 실행 중 오류 발생 : " + e.toString());






        } // try(socket)
      } // while



      for (ApplicationContextListener listener : listeners) {
        listener.contextDestroyed(context);
      }
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
}
