//콘솔로 출력하기 - 형식을 갖춰 출력하기
package ch02;

public class Test12 {
  public static void main(String[] args) {
   System.out.printf("hello!\n");
   
   //%s : 지정한 자리에 문자열을 삽입한다.
   //       삽입할 값은 오른쪽에 설정한다
   System.out.printf("이름: %s\n", "홍길동");
   System.out.printf("이름: %s입니다\n", "꺽정");
   
   System.out.printf("%d %x %c %b\n",65,65,65,true);
   
   //한개의 값을 여러 곳에 삽입 할 수 있다.
      System.out.printf("%2$d %2$x %2$c\n",65,66,67);
   //값을 출력할 때 사용 할 공간을 지정할 수 있다.
      // %[-][사용할 공간너비]
      System.out.printf("'%s' '%s'\n", "홍길동", "임꺽정");
      System.out.printf("'%-10s' '%10s'\n","홍길동","임꺽정");
      
      System.out.printf("'%-10d' '%10d'\n",12345,12345);
      
      System.out.printf("'%010d' '%07d'\n",12345,12345);

  }
}

