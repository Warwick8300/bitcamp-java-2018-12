// 키보드로 입력한 값 받기 토큰 단위로 문자열 읽
package ch03;
public class Test09 {
    public static void main(String[] args) {
      java.util.Scanner keyboard = new java.util.Scanner(System.in);
      System.out.println("나이? ");
     int age = keyboard.nextInt(); // 한개의 토큰(
      //nextInt()는 한개의 토큰을 읽은 후에 줄 바꿈 코드는 읽기 전상태로 내비둔다.
     // 따라서 다음 nextLine()을 호출하면의도치 않게 빈문자열을 가진 한줄을 읽는 상황이된다
     // nextInt() 다음에 nextLine()을 호출할 때 이런 상환이 발생한다
     // 해결 방법 ? nextint()를 호출한 후 남아 있는 엔터 코드를 읽어서 제거하라.
     keyboard.nextLine(); // 남아있는 빈문자열의 한 줄 (LF 코드)을 읽어서 버린다.
     System.out.println("이름? ");
         String name = keyboard.nextLine();
         System.out.printf("%d %s\n",age,name);
    }
}
