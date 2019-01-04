
package bitcamp.lms;

public class App2 {
    
    public static void main(String[] args) {
      
      java.util.Scanner keyboard = new java.util.Scanner(System.in);
      System.out.print("번호 입력 : ");
      int studentNo = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("이름 : ");
      String studentName = keyboard.nextLine();
      System.out.print("이메일 : ");
      String studentEmail = keyboard.nextLine();
      System.out.print("암호 : ");
      String studentPassword = keyboard.nextLine();
      System.out.print("사진 : ");
      String studentPicture = keyboard.nextLine();
      System.out.print("전화: ");
      String studentCellphone = keyboard.nextLine();
      System.out.print("가입일 : ");
      String studentJoinDate = keyboard.nextLine();

        System.out.printf("번호 : %d\n",studentNo);
        System.out.printf("이름: %s\n",studentName);
        System.out.printf("이메일 : %s\n",studentEmail);
        System.out.printf("암호 : %s\n",studentPassword);
        System.out.printf("사진 : %s\n",studentPicture);
        System.out.printf("전화: %s\n",studentCellphone);
        System.out.printf("가입일 : %s\n",studentJoinDate);
      
      /*
      System.out.printf("번호: %d\n", 1);
      System.out.printf("이름: %s\n", "홍길동");
      System.out.printf("이메일: %s\n", "hong@test.com");
      System.out.printf("암호: %s\n", "1111");
      System.out.printf("사진: %s\n", "hong.png");
      System.out.printf("전화: %s\n", "1111-1111");
      System.out.printf("가입일: %s\n", "2019-01-01");
*/
    }
}
