package bitcamp.lms;
import java.sql.Date;
import java.util.Scanner;
import bitcamp.lms.sub.Board;
public class App3 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Date todayDate = new Date(System.currentTimeMillis()); 
    Board []  board = new Board[1000];
  
    int id = 0;
    end:
      while(true )
      { 
        board[id] = new Board();
        System.out.print("번호 : ");
        board[id].postNo = keyboard.nextInt();
        System.out.print("내용 : ");
        board[id].postContent = keyboard.next();
        board[id].postDate = todayDate;
        board[id].postView = 0;
        id++;
        re:
          while(true)
          {
            String input; // 계속입력할건가 말껀가
            System.out.print("계속 입력하실? (y/n) : ");
            input = keyboard.nextLine();
            if(input.equalsIgnoreCase("y") | input.equals("")) 
              break re;
            else if (input.equalsIgnoreCase("n"))
              break end;
            else
              System.out.println("다시입력하세요");
          }
      }
    keyboard.close();
    System.out.println("=================================");
    int num=0;
    while (num < id) {
      System.out.printf("번호 : %d ", board[num].postNo);
      System.out.printf("내용: %s ", board[num].postContent);
      System.out.printf("작성일 : %s ", board[num].postDate);
      System.out.printf("조회수 : %d\n", board[num].postView);
      System.out.println("=================================");
      num++;   
    }
  }
}
