
package bitcamp.lms;

import java.util.Scanner;
import bitcamp.lms.Lesson;;

public class App {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Lesson[] lesson = new Lesson[1000];
    
    int id = 0;
    end:
    while(id < 1000 )
    { 
      lesson[id] = new Lesson();
      System.out.print("번호 입력 : ");
      lesson[id].classNo = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("수업명 : ");
      lesson[id].className = keyboard.nextLine();
      System.out.print("설명 : ");
      lesson[id].classExplanation = keyboard.nextLine();
      System.out.print("시작일 : ");
      lesson[id].classStartDate = keyboard.nextLine();
      System.out.print("종료일 : ");
      lesson[id].classEndDate = keyboard.nextLine();
      System.out.print("총수업시간: ");
      lesson[id].classTime = keyboard.nextInt();
      System.out.print("일수업시간 : ");
      lesson[id].classHour = keyboard.nextInt();
      keyboard.nextLine();
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
      System.out.printf("번호 : %d ",lesson[num].classNo);
      System.out.printf("수업명: %s ",lesson[num].className);
      System.out.printf("시작일 : %s ~",lesson[num].classStartDate);
      System.out.printf(" %s ",lesson[num].classEndDate);
      System.out.printf("총수업시간: %d\n",lesson[num].classTime);
      System.out.println("=================================");
      num++;
    }
  }

}
