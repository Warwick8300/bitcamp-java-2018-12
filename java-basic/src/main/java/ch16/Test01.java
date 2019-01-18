package ch16;

import java.util.Calendar;
import java.util.Date;
import ch14.b.C;


//제네릭(generic) - 타입 파라미터 : 파라미터 값으로 받는 것.
public class Test01 {

  public static void main(String[] args) {
    
   // String obj = echo(new String("Hello")); //컴파일오류
      
    String obj =(String) echo(new String("Hello"));
 
    
    Integer obj2 =(Integer) echo(new String("Hello")); //실행 오류
    
    Date obj3  = (Date)echo(new Date());
    
    Calendar obj4 = (Calendar)echo(Calendar.getInstance());
    
  }
  public static Object echo(Object obj) {
    return  obj;
  }

}
