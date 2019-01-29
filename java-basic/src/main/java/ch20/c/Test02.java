package ch20.c;

import java.util.HashSet;
import java.util.Iterator;

// java.util.Set 클래스사용법 add(), Iterator
public class Test02 {
  public static void main(String[] args) {
   
    class Student{
      String name;
      int age;
      public Student(String name, int age) {
        this.name = name;
        this.age = age;
      }
      @Override
      public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
      }
    }
    HashSet<Student> set = new HashSet<>();
    set.add(new Student("aaa",200));
    set.add(new Student("bbb", 300));
    set.add(new Student("ccc", 400));
    
    
    
    Iterator<Student> iterator = set.iterator();
    
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    
    
    
    
    System.out.println("---------------------");
    
    Object[] values = set.toArray();
    for(Object value : values) {
      System.out.println(value);
    }
    
    System.out.println("---------------------");
    String[] temp = new String[0];
    String[] values2 = set.toArray(temp);
    System.out.println(temp==values2);
    for(String value : values2) {
      System.out.println(value);
    }
    
    System.out.println("---------------------");

    Student[] values3 = new Student[set.size()];
    Student[] valuse4 =set.toArray(values3);
    System.out.println(values3==valuse4);
    for(Student value : valuse4) {
      System.out.println(value);
    }
  }
  
}
