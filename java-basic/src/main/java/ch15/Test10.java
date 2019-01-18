package ch15;
//hash code 응용

import java.util.HashMap;


class Key{
  String contents;
  
  @Override
  public String toString() {
    return "key [contents=" + contents + "]";
  }

  public Key(String contents) {
    this.contents = contents;
  }
}
public class Test10 {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    
    Key k1 = new Key("ok");
    Key k2 = new Key("no");
    Key k3 = new Key("haha");
    Key k4 = new Key("ohora");
    Key k5 = new Key("hul");
    
    
    map.put(k1, new Student("유관순",20,false));
    map.put(k2, new Student("홍길동",20,false));
    map.put(k3, new Student("임꺽정",60,false));
    map.put(k4, new Student("윤봉길",60,false));
    map.put(k5, new Student("천재님",60,false));
    
    System.out.println(map.get(k4));
    
    Key k6 = new Key("ohora");
    
    
    System.out.println(k4 == k6);//인스턴스는 다르지만 해쉬코드는 같다

    System.out.println(k4.hashCode());
    System.out.println(k6.hashCode());
    System.out.println(k4.equals(k6));
    
    System.out.println(map.get(k6));
    System.out.println(map.get(k2));

    
    String k7 =  new String("Haha");
    System.out.println(map.get(k7));
    
  }


}
