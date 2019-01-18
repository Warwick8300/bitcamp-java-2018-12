package ch15;
//hash code 응용

import java.util.HashMap;
public class Test09 {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    
    String k1 = new String("ok");
    String k2 = new String("no");
    String k3 = new String("haha");
    String k4 = new String("ohora");
    String k5 = new String("hul");
    
    
    map.put(k1, new Student("유관순",20,false));
    map.put(k2, new Student("홍길동",20,false));
    map.put(k3, new Student("임꺽정",60,false));
    map.put(k4, new Student("윤봉길",60,false));
    map.put(k5, new Student("천재님",60,false));
    
    String k6 = new String("haha");
    
    
    System.out.println(k3 == k6);//인스턴스는 다르지만 해쉬코드는 같다

    System.out.println(k3.hashCode());
    System.out.println(k6.hashCode());
    System.out.println(k3.equals(k6));
    
    System.out.println(map.get(k6));
    System.out.println(map.get(k2));

    
    String k7 =  new String("Haha");
    System.out.println(map.get(k7));
    //
  }


}
