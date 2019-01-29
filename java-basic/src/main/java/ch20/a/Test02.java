package ch20.a;

import java.util.ArrayList;
import java.util.Date;

//java.util.Array list 사용법 - 메서드 사용
public class Test02 {

  public static void main(String[] args) {

    
    
    
    
    
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("aao");
    list2.add("bbo");
    list2.add("cca");
    list2.add("ddo"); 
    list2.add(null);
    list2.add("eee");
    list2.add(null);
    list2.add("aao");
    list2.add("bbo");
    System.out.println(list2);
    System.out.println(list2.remove(2));
    System.out.println(list2);
    
    list2.set(2,"xxxx");
    System.out.println(list2);
    
    System.out.println(list2.get(2));
    //
    
    System.out.println(list2.get(3));
  }

}
