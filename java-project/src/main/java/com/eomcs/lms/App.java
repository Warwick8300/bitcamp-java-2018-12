package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;

import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  static final int LENGTH = 10;


  public static void main(String[] args) {
    BoardHandler board1 = new BoardHandler(keyboard);
    BoardHandler board2 = new BoardHandler(keyboard);
    LessonHandler lesson1 = new LessonHandler(keyboard);
    MemberHandler member1 = new MemberHandler(keyboard);
    
   

    while (true) {
      String command = prompt();

      if (command.equals("/lesson/add")) {
        lesson1.addLesson();

      } else if (command.equals("/lesson/list")) {
        lesson1.listLesson();

      } else if (command.equals("/member/add")) {   
        member1.addMember();

      } else if (command.equals("/member/list")) {
        member1.listMember();

      } else if (command.equals("/board/add")) {
        board1.addBoard();

      } else if (command.equals("/board/list")) {
        board1.listBoard();
        
      } else if (command.equals("/board2/add")) {
        board2.addBoard();

      } else if (command.equals("/board2/list")) {
        board2.listBoard();
        
      } else if (command.equals("quit")) {
        System.out.println("안녕!");
        break;

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }

      System.out.println(); // 결과 출력 후 빈 줄 출력
    }

    keyboard.close();
  }

  private static String prompt() {
    System.out.print("명령> ");
    return keyboard.nextLine().toLowerCase();
  }






}
