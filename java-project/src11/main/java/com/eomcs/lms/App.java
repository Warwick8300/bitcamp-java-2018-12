package com.eomcs.lms;
import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;
public class App {
  static Scanner keyboard = new Scanner(System.in);
  static final int LENGTH = 100;

  public static void main(String[] args) {
    LessonHandler.keyboard = keyboard;
    BoardHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    end:
      while(true){

        String input; // 계속입력할건가 말껀가
        System.out.print("명령> ");
        input = prompt();
        if(input.equals("/lesson/add")) {
          LessonHandler.addLesson();
        }
        else if (input.equals("/lesson/list")) {
          if(LessonHandler.lessonsSize == 0)
            System.out.println("자료가 없다");
          
          LessonHandler.listLesson();
        }
        else if (input.equals("/member/add")) {
          MemberHandler.addMember();
        }
        else if (input.equals("/member/list")) {
          if(MemberHandler.membersSize == 0)
            System.out.println("자료가 없다");
          MemberHandler.listMember();
        }
        else if (input.equals("/board/add")) {
          BoardHandler.addBoard();
        }
        else if (input.equals("/board/list")) {
          if(BoardHandler.boardsSize == 0)
            System.out.println("자료가 없다");
          BoardHandler.listBoard();
        }
        else if(input.equals("quit")) {
          System.out.println("안녕\n...");
          break end;
        }
        else {
          System.out.println("실행할 수 없는 명령입니다.");
        }
      }
  keyboard.close();

  }

  public static String prompt() {
    return keyboard.nextLine();
  }
  
}





