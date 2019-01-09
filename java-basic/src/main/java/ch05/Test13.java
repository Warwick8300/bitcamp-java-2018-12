// 흐름i <= 10 제어문 - for 반복문
package ch05;

public class Test13 {

  public static void main(String[] args) {
    for(int i = 1, j = 3, k =5; i <= 10 ; i ++)
      System.out.print(i + " ");
    System.out.println();

    //for 문의 중첩
    for (int i = 1; i <= 10 ; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    System.out.println("============================");
    //브레이크
    for (int i = 1; i <= 10 ; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
        if(j == 5)
          break;
      }
      System.out.println();
    }
    System.out.println("============================");
    //라벨
    loop1:
      for (int i = 1; i <= 10 ; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
          if(j == 5)
            break loop1;
        }
        System.out.println();
      }
    System.out.println("============================");
    //continue 
    loop1:
      for (int i = 1; i <= 10 ; i++) {
        for (int j = 1; j <= i; j++) {
          
          if(j % 2 == 0)
            continue;
          System.out.print(j + " ");
        }
        System.out.println();
      }
  }
}













