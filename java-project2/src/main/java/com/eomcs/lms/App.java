// 18단계 : Observer 패턴을 적용하여 애플리케이션이 시작할때 애플리케이션이 사용할 객체를준비
// 1) 애플리키에션이 시작되면 옵저버에게 알린다.
// 2) 옵저버는 애플리케이션이 사용할 객체를 만들어 보관소에 저장
// 3) 애플리케이션이 사용자 명령을 처리할 때 보관소에 해당 객체를 꺼내 사용한다.

// 4 작업
// 1) observer에게 상태 변경을 알릴 때 호출 규칙을 인터페이스로 정의한다
// => ApplicationContextListener
// 2) 규칙에 따라 옵저버를 만든다.
// => ApplicationContextListenerImpl
// 3) 옵저버를 App 클래스에 등록한다.
// => App.addApplicationContextListener():
// 4) App 클래스의 서비스를 시작하거나 종료할 때 등록된 옵저버에게 알리낟.
package com.eomcs.lms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.handler.Command;

public class App {

  Scanner keyboard = new Scanner(System.in);
  Stack<String> commandHistory = new Stack<>();
  Queue<String> commandHistory2 = new LinkedList<>();
  ArrayList<ApplicationContextListener> listeners = new ArrayList<>();


  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);

  }

  public void service() throws Exception {


    HashMap<String, Object> context = new HashMap<>();
    context.put("keyboard", keyboard);


    for (ApplicationContextListener listener : listeners) {
      listener.contextInitialized(context);
    }



    while (true) {
      String command = prompt();

      commandHistory.push(command);
      commandHistory2.offer(command);

      if (command.equals("quit")) {
        System.out.println("종료합니다.");
        break;

      } else if (command.equals("history")) {
        printCommandHistory();
        continue;

      } else if (command.equals("history2")) {
        printCommandHistory2();
        continue;
      }

      // 사용자가 입력한 명령으로 Command 객체를 찾는다.
      Command commandHandler = (Command) context.get(command);
      if (commandHandler == null) {
        System.out.println("실행할 수 없는 명령입니다.");
        continue;
      }

      // stateful을 stateless로 전환할 때 주의할 점!
      // => 가능한 서버에 요청하는 시점에 서버와 연결하라!
      // => 이 클래스에서 서버와 연결하지 않고
      // 데이터를 요청하는 일을 하는 객체(*Agent)에 서버 연결을 맡긴다.
      try {
        commandHandler.execute();
        System.out.println();

      } catch (Exception e) {
        System.out.println("명령어 실행 중 오류 발생 : " + e.toString());
      }
    }

    keyboard.close();


    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }

  @SuppressWarnings("unchecked")
  private void printCommandHistory() {
    Stack<String> temp = (Stack<String>) commandHistory.clone();

    while (temp.size() > 0) {
      System.out.println(temp.pop());
    }
  }

  @SuppressWarnings("unchecked")
  private void printCommandHistory2() {
    Queue<String> temp = (Queue<String>) ((LinkedList<String>) commandHistory2).clone();

    while (temp.size() > 0) {
      System.out.println(temp.poll());
    }
  }

  private String prompt() {
    System.out.print("명령> ");
    return keyboard.nextLine().toLowerCase();
  }

  public static void main(String[] args) throws Exception {
    App app = new App();

    app.addApplicationContextListener(new ApplicationInitializer());
    // App 을 실행한다.
    app.service();
  }
}
