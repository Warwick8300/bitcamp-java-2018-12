// 키보드로 입력한 값 받기
package ch03;

public class Test07 {
    public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
     System.out.println("이름을 입력하시오 ");
     
     java.lang.String name = keyboard.nextLine();
     //사용자가 입력한 문자를출력한다.
 System.out.println("나을 입력하시오 ");
     
     java.lang.String age = keyboard.nextLine();
     System.out.printf("당신의 이름은 %s 고 나이는 %s 입니다.\n",name,age);
    }
}
