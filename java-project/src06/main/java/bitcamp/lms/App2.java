package bitcamp.lms;
import java.util.Date;
import java.util.Scanner;

public class App2 {



  public static void main(String[] args) {
    class Member{
      int studentNo;  //번호
      String studentName;  // 이름
      String studentEmail; // 이메일
      String studentPassword; //암호
      String studentPicture;  //사진
      String studentCellphone; //폰번호
      Date studentJoinDate; //가입일
    }
    Scanner keyboard = new Scanner(System.in);
    Date registeredDate = new Date(System.currentTimeMillis()); 
    Member[] member = new Member[1000];
    String str; // 계속입력할건가 말껀가
    int id = 0;
    end:
      while(true)
      { 
        member[id] = new Member();
        System.out.print("번호 입력 : ");
        member[id].studentNo = keyboard.nextInt();
        System.out.print("이름 : ");
        member[id].studentName = keyboard.next();
        System.out.print("이메일 : ");
        member[id].studentEmail = keyboard.next();
        System.out.print("암호 : ");
        member[id].studentPassword = keyboard.next();
        System.out.print("사진 : ");
        member[id].studentPicture = keyboard.next();
        System.out.print("전화: ");
        member[id].studentCellphone = keyboard.next();
        member[id].studentJoinDate = registeredDate;
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
      System.out.printf("번호 : %d ", member[num].studentNo);
      System.out.printf("이름 : %s", member[num].studentName);
      System.out.printf("이메일 : %s", member[num].studentEmail);
      System.out.printf("전화 : %s", member[num].studentCellphone);
      System.out.printf("가입일 : %s\n", member[num].studentJoinDate);
      System.out.println("=================================");
      num++;   
    }

  }

}