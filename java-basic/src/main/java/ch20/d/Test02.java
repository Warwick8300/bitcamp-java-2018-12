package ch20.d;

import java.util.HashMap;
import java.util.Hashtable;

//Map클래스 사용법 
public class Test02 {

  public static void main(String[] args) {
    class Student{
      String name;
      int age;
      public Student(String name, int age) {
        this.name = name;
        this.age= age;
      }
      @Override
      public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
      }
    }


    //java.util.Map 구현체

    // HashMap
    //Hastable
    HashMap<String, Student> map = new HashMap<>();
    Hashtable<String, Student> table= new Hashtable<>();
    
    
    map.put("aaa",new Student("홍길동",20));
    table.put("aaa",new Student("홍길동",20));

    System.out.println(map.get("aaa"));
    System.out.println(table.get("aaa"));
    
    System.out.println("============================");
    
    map.put(null,new Student("임꺽정",20));
    //table.put(null,new Student("임꺽정",20));
    System.out.println(map.get(null));
 //   System.out.println(table.get(null));
    
    map.put("CCC",null);
    //table.put("CCC",null);
    System.out.println(map.get("CCC"));
   // System.out.println(table.get("CCC"));
    
  }

}
