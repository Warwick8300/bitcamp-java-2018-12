// 키보드로 입력한 값 받기
package ch03;

public class Test06 {
    public static void main(String[] args) {
     /*java.io.InputStream 키보드읽기도구 = System.in;
   
     java.util.Scanner 데이터를종류별로쉽게읽으수있는기능을갖춘도구
     = new java.util.Scanner(키보드읽기도구);
     
     java.lang.String 읽은문자열 = 데이터를종류별로쉽게읽으수있는기능을갖춘도구.nextLine();
     
     System.out.println(읽은문자열);
     */
      java.io.InputStream in = System.in;
     java.util.Scanner keyboard = new java.util.Scanner(in);
     System.out.println("이름을 입력하시오 ");
     
     java.lang.String str = keyboard.nextLine();
     //사용자가 입력한 문자를출력한다.
     System.out.printf("당신의 이름은 %s 입니다.\n",str);
    }
}
