package ch20.a;

import java.util.ArrayList;
import java.util.Date;

//java.util.Array list 사용법 - 제네릭설정
//자바 컬렉션 API
// 자바에서 데이터 목록을 다루는 크래스를 말하낟.

public class Test01 {

  public static void main(String[] args) {

    ArrayList list = new ArrayList();
    list.add("hello");
    list.add(Integer.valueOf(100));
    list.add(100);
    list.add(new Date());    
    
    
    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("hello");
    list2.add(Integer.valueOf(100));
    list2.add(100);
    list2.add(new Date()); 
  }

}
