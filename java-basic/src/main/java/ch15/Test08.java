package ch15;
//hash code 응용
import java.util.HashMap;
public class Test08 {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    
    
    Integer k2 = new Integer(102);
    map.put(k2, new Student("홍길동",20,false));
    
    Integer k6 = new Integer(102);
    map.put(k6, new Student("임꺽정",60,false));
    map.put(k6, new Student("임꺽증",60,false));
    System.out.println(k2 == k6);//인스턴스는 다르지만 해쉬코드는 같다

    System.out.println(k2.hashCode());
    System.out.println(k6.hashCode());
    System.out.println(k2.equals(k6));
    
    System.out.println(map.get(k6));
    System.out.println(map.get(k2));

    
    Integer k7 = new Integer(200);
    System.out.println(map.get(k7));
    //
  }


}
