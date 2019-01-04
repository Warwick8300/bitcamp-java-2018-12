
package bitcamp.lms;

public class App {
    
    public static void main(String[] args) {
      java.util.Scanner keyboard = new java.util.Scanner(System.in);
      System.out.println("번호 입력 : ");
      int classNo = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("수업명:");
      String className = keyboard.nextLine();
      System.out.println("설명 : ");
      String classExplanation = keyboard.nextLine();
      System.out.println("시작일 : ");
      String classStartDate = keyboard.nextLine();
      System.out.println("종료일 : ");
      String classEndDate = keyboard.nextLine();
      System.out.println("총수업시간: ");
      int classTime = keyboard.nextInt();
      System.out.printf("일수업시간 : ");
      int classHour = keyboard.nextInt();

        System.out.printf("번호 : %d\n",classNo);
        System.out.printf("수업명: %s\n",className);
        System.out.printf("설명 : %s\n",classExplanation);
        System.out.printf("시작일 : %s\n",classStartDate);
        System.out.printf("종료일 : %s\n",classEndDate);
        System.out.printf("총수업시간: %d\n",classTime);
        System.out.printf("일수업시간 : %d\n",classHour);
    }
}
