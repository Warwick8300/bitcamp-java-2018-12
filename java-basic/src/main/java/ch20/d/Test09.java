package ch20.d;

import java.util.Enumeration;
import java.util.Hashtable;

//Hashtable 에서 value  목록 꺼내2 elements
public class Test09 {

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
  
    Hashtable<String, Student> map = new Hashtable<>();
    
    
    map.put("aaa",new Student("홍길동",20));
    map.put("bbb",new Student("임꺽정",30));
    map.put("ccc",new Student("안중근",25));
    
    Enumeration<Student> values = map.elements();
    
    while(values.hasMoreElements()) {
      System.out.println(values.nextElement());
    }
  }

}
