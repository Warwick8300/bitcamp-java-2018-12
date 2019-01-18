package ch15;
class My1 /*extends Object*/ {
  String name;
  int age;
  boolean working;
  
  
  @Override
  public String toString() {
    return "Student1 [name=" + name + ", age=" + age + ", working=" + working + "]";
  }


  public void put (String name, int age ,boolean working)
  {
   this.name = name;
   this.age = age;
       this.working =working;
  }
  
}



public class Test01 {

  public static void main(String[] args) {
    // istanceof 연산자
    My1 obj = new My1();
    
    System.out.println(obj instanceof My1);
    //System.out.println(obj instanceof String);
    System.out.println(obj instanceof Object);

    System.out.println(obj.toString());
    System.out.println(obj.hashCode());
    System.out.println(obj.equals("hello"));
    
    
  
  }

}
