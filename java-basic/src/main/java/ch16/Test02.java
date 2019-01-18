package ch16;

import java.util.Calendar;
import java.util.Date;
import ch14.b.C;


//제네릭(generic) - 적용전
public class Test02 {

  public static void main(String[] args) {


    String obj = echo(new String("Hello"));
    Date obj3  = echo(new Date());  
    Calendar obj4 =echo(Calendar.getInstance());

  }
  public static Object echo(Object obj) {
    return  obj;
  }
  public static String echo(String obj) {
    return  obj;
  }  public static Date echo(Date obj) {
    return  obj;
  }  public static Calendar echo(Calendar obj) {
    return  obj;
  }
}
