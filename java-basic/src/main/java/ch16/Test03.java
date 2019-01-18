package ch16;

import java.io.File;
import java.util.Calendar;
import java.util.Date;


//제네릭(generic) 적용후 - 메서드가 다루는 객체 의 타입 이름 ㅇ파라미터로 받는다 .
public class Test03 {

  public static void main(String[] args) {


    String obj = echo(new String("Hello"));
    Date obj2  = echo(new Date());  
    Calendar obj3 =echo(Calendar.getInstance());
    File obj4 = echo(new File("okok"));
    Integer obj5 = echo(Integer.valueOf(100));
  }
  public static <Ok> Ok echo(Ok obj) {
    return  obj;
  }
  
  

}
