package ch20.d;

import java.util.HashMap;
import java.util.Set;

//HashMap 에서 key  목록 꺼내
public class Test03 {

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
  
    HashMap<String, Student> map = new HashMap<>();
    
    
    map.put("aaa",new Student("홍길동",20));
    map.put("bbb",new Student("임꺽정",30));
    map.put("ccc",new Student("안중근",25));
    
    Set<String> keyset = map.keySet();
    
    for(String key : keyset) {
      System.out.printf("%s %s\n",key, map.get(key));
    }
  }

}
