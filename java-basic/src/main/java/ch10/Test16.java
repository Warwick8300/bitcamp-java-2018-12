package ch10;

import java.util.Calendar;

//생성자 활용 -캘린더 생성자
public class Test16 {
  public static void main(String[] args) throws Exception {
    Calendar c1;
 
 //생성자가 있더라하더라고 접근 권한이 업으면 호출할 수 없
 //c1 = new Clalender();
 
    c1 = Calendar.getInstance();
    System.out.println(c1.get(Calendar.YEAR));
    //팩토리 메서드
    
 
    
  }
}