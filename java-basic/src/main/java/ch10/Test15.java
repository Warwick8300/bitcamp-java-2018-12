package ch10;

import java.util.Date;

//생성자 활용 -java.util.Date 클래스의 생성자
public class Test15 {
  public static void main(String[] args) throws Exception {
    Date d1 = new Date(); //현재시간을 저장한다.
    System.out.println(d1);
    
    
    
    //Date(long): 1970-01-01 00:00:00 부터 지금까지 경과된밀리초
    Date d2 = new Date(1000);
    System.out.println(d2);
    Date d3 = new Date(System.currentTimeMillis());
    System.out.println(d3);
    Date d4 = new Date(2019, 01, 15);  //(119,0,15)
    System.out.println(d4);
    
    //java.sql.Date d5 = new 
    java.sql.Date d5 = new java.sql.Date(System.currentTimeMillis());
    System.out.println(d5);
    
    java.sql.Date d6  = java.sql.Date.valueOf("2019-01-16");
    System.out.println(d6);
  
  }
}