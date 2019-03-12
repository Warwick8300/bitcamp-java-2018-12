// 비트 연산자 응용
package ch04;

public class Test19 {
  public static void main(String[] args) {
    // 한개의 정수 값에 여러개의 정보를 저장하기
    // => 비트의 1 또는 0을 이용하여 정보를 표한 할 수있다.
    // => 예를 들어 개발자가 프로그래밍 가능한 언어를 int 값으로 표현해보자!
    // java : 0000 0001 = 0x01
    // C : 0000 0010 = 0x02
    // C++ : 0000 0100

    int d1 = 0x01 | 0x02 | 0x03 | 0x80;
    int d2 = 0x0087;

    System.out.println(d1);
    System.out.println(d2);
    // 정수 값에서 특정 비트의 값만 검사하는 방법
    // typescript 언어를 할줄 아는지검사하기


    System.out.printf("java       : %b\n", (d2 & 0x0001) == 0x0001);
    System.out.printf("c          : %b\n", (d2 & 0x0002) == 0x0002);
    System.out.printf("c++        : %b\n", (d2 & 0x0004) == 0x0004);
    System.out.printf("python     : %b\n", (d2 & 0x0008) == 0x0008);
    System.out.printf("php        : %b\n", (d2 & 0x0010) == 0x0010);
    System.out.printf("kotlin     : %b\n", (d2 & 0x0020) == 0x0020);
    System.out.printf("groovy     : %b\n", (d2 & 0x0040) == 0x0020);
    System.out.printf("javascript : %b\n", (d2 & 0x0080) == 0x0080);
    System.out.printf("typestript : %b\n", (d2 & 0x0100) == 0x0100);
    System.out.printf("go         : %b\n", (d2 & 0x0200) == 0x0200);
    System.out.printf("sql        : %b\n", (d2 & 0x0400) == 0x0400);
    System.out.printf("R          : %b\n", (d2 & 0x0800) == 0x0800);


  }
}


