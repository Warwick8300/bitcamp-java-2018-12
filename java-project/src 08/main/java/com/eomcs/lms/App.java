package com.eomcs.lms;
import java.sql.Date;
import java.util.Scanner;
public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    final int LENGTH = 100;
    int lessonsSize = 0;
    int membersSize = 0;
    int boardsSize = 0;
    Lesson[] lessons = new Lesson[LENGTH];
    Member[] members = new Member[LENGTH];
    Board[] boards = new Board[LENGTH];

    end:
      while(true)
      {
        String input; // 계속입력할건가 말껀가
        System.out.print("명령> ");
        input = keyboard.nextLine();
        if(input.equals("/lesson/add")) {
         
              // 클래스로 정의한 새 데이터 타입의 메모리(인스턴스) 만들기
              Lesson lesson = new Lesson();
              // 사용자가 입력한 값을 메모리에 담는다.
              System.out.print("번호? ");
              lesson.no = Integer.parseInt(keyboard.nextLine());
              System.out.print("수업명? ");
              lesson.title = keyboard.nextLine();
              System.out.print("설명? ");
              lesson.contents = keyboard.nextLine();
              System.out.print("시작일? ");
              lesson.startDate = Date.valueOf(keyboard.nextLine());
              System.out.print("종료일? ");
              lesson.endDate = Date.valueOf(keyboard.nextLine());
              System.out.print("총수업시간? ");
              lesson.totalHours = Integer.parseInt(keyboard.nextLine());
              System.out.print("일수업시간? ");
              lesson.dayHours = Integer.parseInt(keyboard.nextLine());

              // i 번째 배열에 수업 정보를 담고 있는 Lesson 객체(의 주소)를 보관한다.
              lessons[lessonsSize++] = lesson;
              System.out.println("저장하였습니다.");
             
        }
        else if (input.equals("/lesson/list")) {
          if(lessonsSize == 0)
            System.out.println("자료가 없다");
          for (int j = 0; j < lessonsSize; j++) {
            System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
                lessons[j].no, lessons[j].title, lessons[j].startDate, 
                lessons[j].endDate, lessons[j].totalHours);
          }
        }
        else if (input.equals("/member/add")) {
        
              Member member = new Member();
              System.out.print("번호? ");
              member.no = Integer.parseInt(keyboard.nextLine());
              System.out.print("이름? ");
              member.name = keyboard.nextLine();
              System.out.print("이메일? ");
              member.email = keyboard.nextLine();
              System.out.print("암호? ");
              member.password = keyboard.nextLine();
              System.out.print("사진? ");
              member.photo = keyboard.nextLine();
              System.out.print("전화? ");
              member.tel = keyboard.nextLine();
              member.registeredDate = new Date(System.currentTimeMillis()); 
              members[membersSize++] = member;
              System.out.println("저장하였습니다.");
            
        }
        else if (input.equals("/member/list")) {
          if(membersSize == 0)
            System.out.println("자료가 없다");
          for (int j = 0; j < membersSize; j++) {
            System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", 
                members[j].no, members[j].name, members[j].email, 
                members[j].tel, members[j].registeredDate);
          }
        }
        else if (input.equals("/board/add")) {
         
              Board board = new Board();
              System.out.print("번호? ");
              board.no = Integer.parseInt(keyboard.nextLine());
              System.out.print("내용? ");
              board.contents = keyboard.nextLine();
              board.createdDate = new Date(System.currentTimeMillis()); 
              board.viewCount = 0;
              boards[boardsSize++] = board;
              System.out.println("저장하였습니다.");
            
        }
        else if (input.equals("/board/list")) {
          if(boardsSize == 0)
            System.out.println("자료가 없다");
          for (int j = 0; j < boardsSize; j++) {
            System.out.printf("%3d, %-20s, %s, %d\n", 
                boards[j].no, boards[j].contents, boards[j].createdDate, boards[j].viewCount);
          }
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
}






