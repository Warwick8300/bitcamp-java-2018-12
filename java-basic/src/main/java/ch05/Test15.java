// 흐름i <= 10 제어문 - for 반복문
package ch05;

import java.util.ArrayList;

public class Test15 {

  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순","안중근","윤봉길","김구" };
    for (String name :names){
      System.out.print(name + " ");
    }
    System.out.println();
    
    //컬렉션 객체 사용
    ArrayList<String> list = new ArrayList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    for (String name : list) {
      System.out.println(name + " ");
    }
    System.out.println();
  }
}















