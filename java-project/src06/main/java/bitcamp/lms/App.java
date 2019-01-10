
package bitcamp.lms;
public class App {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    int [] classNo = new int[1000]; //수업명
    String [] className = new String[1000]; // 수업명
    String [] classExplanation = new String[1000]; //설명
    String [] classStartDate = new String[1000]; //시작일
    String [] classEndDate = new String[1000]; //종료일
    int [] classTime = new int[1000]; //총수업시간
    int [] classHour = new int[1000]; //일수업시간
    String str; // 계속입력할건가 말껀가
    int id = 0;
    end:
    while(id < 1000 )
    { 
      System.out.print("번호 입력 : ");
      classNo[id] = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("수업명 : ");
      className[id] = keyboard.nextLine();
      System.out.print("설명 : ");
      classExplanation[id] = keyboard.nextLine();
      System.out.print("시작일 : ");
      classStartDate[id] = keyboard.nextLine();
      System.out.print("종료일 : ");
      classEndDate[id] = keyboard.nextLine();
      System.out.print("총수업시간: ");
      classTime[id] = keyboard.nextInt();
      System.out.print("일수업시간 : ");
      classHour[id] = keyboard.nextInt();
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
      System.out.printf("번호 : %d ",classNo[num]);
      System.out.printf("수업명: %s ",className[num]);
      System.out.printf("시작일 : %s ~",classStartDate[num]);
      System.out.printf(" %s",classEndDate[num]);
      System.out.printf("총수업시간: %d\n",classTime[num]);
      System.out.println("=================================");
      num++;
    }
  }

}
