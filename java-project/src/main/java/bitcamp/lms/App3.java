package bitcamp.lms;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class App3 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Date todayDate = new Date(System.currentTimeMillis()); 
    int [] postNo = new int[1000]; //번호
    String [] postContent = new String[1000]; // 내용
    Date [] postDate = new Date[1000]; //작성일
    int [] postView = new int[1000]; //조회수
    String str; // 계속입력할건가 말껀가
    int id = 0;
    end:
      while(true )
      { 
        System.out.print("번호 : ");
        postNo[id] = keyboard.nextInt();
        System.out.print("내용 : ");
        postContent[id] = keyboard.next();
        postDate[id] = todayDate;
        postView[id] = 0;
        id++;
        re:
          while(true)
          {
            System.out.print("계속 입력하실? (y/n) : ");
            str = keyboard.next();
            if(str.equalsIgnoreCase("y")) 
              break re;
            else if (str.equalsIgnoreCase("n"))
              break end;
            else
              System.out.println("다시입력하세요");
          }
      }
    keyboard.close();
    System.out.println("=================================");
    int num=0;
    while (num < id) {
      System.out.printf("번호 : %d ",postNo[num]);
      System.out.printf("내용: %s ",postContent[num]);
      System.out.printf("작성일 : %s ",postDate[num]);
      System.out.printf("조회수 : %d\n",postView[num]);
      System.out.println("=================================");
      num++;   
    }
  }
}
