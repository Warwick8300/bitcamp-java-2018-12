package ch15;
//hash code hash코드와 equals 오버라이딩


import java.util.HashMap;


class Key2{
  String contents;
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((contents == null) ? 0 : contents.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Key2 other = (Key2) obj;
    if (contents == null) {
      if (other.contents != null)
        return false;
    } else if (!contents.equals(other.contents))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Key2 [contents=" + contents + "]";
  }

  public Key2(String contents) {
    this.contents = contents;
  }
}
public class Test11 {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    
    Key2 k1 = new Key2("ok");
    Key2 k2 = new Key2("no");
    Key2 k3 = new Key2("haha");
    Key2 k4 = new Key2("ohora");
    Key2 k5 = new Key2("hul");
    
    
    map.put(k1, new Student("유관순",20,false));
    map.put(k2, new Student("홍길동",20,false));
    map.put(k3, new Student("임꺽정",60,false));
    map.put(k4, new Student("윤봉길",60,false));
    map.put(k5, new Student("천재님",60,false));
    
    System.out.println(map.get(k4));
    
    Key2 k6 = new Key2("ohora");
    
    
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
