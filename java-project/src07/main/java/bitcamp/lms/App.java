
package bitcamp.lms;

import java.util.Scanner;
import bitcamp.lms.Lesson;;

public class App {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Lesson[] lesson = new Lesson[1000];
    
    int index = 0;
    end:
    while(index < 1000 )
    { 
      lesson[index] = new Lesson();
      System.out.print("번호 입력 : ");
      lesson[index].classNo = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("수업명 : ");
      lesson[index].className = keyboard.nextLine();
      System.out.print("설명 : ");
      lesson[index].classExplanation = keyboard.nextLine();
      System.out.print("시작일 : ");
      lesson[index].classStartDate = keyboard.nextLine();
      System.out.print("종료일 : ");
      lesson[index].classEndDate = keyboard.nextLine();
      System.out.print("총수업시간: ");
      lesson[index].classTime = keyboard.nextInt();
      System.out.print("일수업시간 : ");
      lesson[index].classHour = keyboard.nextInt();
      keyboard.nextLine();
      index++;
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
    while (num < index) {
      System.out.printf("번호 : %3d ",lesson[num].classNo);
      System.out.printf("수업명: %-15s ",lesson[num].className);
      System.out.printf("시작일 : %s ~",lesson[num].classStartDate);
      System.out.printf(" %s ",lesson[num].classEndDate);
      System.out.printf("총수업시간: %d\n",lesson[num].classTime);
      System.out.println("=================================");
      num++;
    }
  }

}
