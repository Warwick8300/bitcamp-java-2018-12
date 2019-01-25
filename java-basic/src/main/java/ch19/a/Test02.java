package ch19.a;
//중첩 클래스 - nested class

// 익명 클래스의 에제를 위한 클래스 
class Car{
  String model;
  public Car() {
    this.model = "미정";
  }
  public Car(String model) {
    this.model = model;
  }
  public void run() {
    System.out.println("달린다!");
  }
}
// 익명 클래스의 에제를 위한 클래스 
interface Pen{
  void write();
}

public class Test02 {

  static class A{}

  class B {}




  public static void main(String[] args) {

    class c {};

    
    //예 1 
    //obj obj = new Car() { 이것도 가능
    Car obj = new Car(){
      @Override
      public void run() {
        System.out.println(this.model + ": 달려라 달려달려");
      }
    };
    obj.run();

    Car obj2 = new Car("티코"){
      @Override
      public void run() {
        System.out.println(this.model + ": 경차 "
            + "달려");
      }
    };
    obj2.run();
    
    Pen obj3 = new Pen() {
      @Override
      public void write() {
        System.out.println("글쓴다.");
      }
    };
    obj3.write();
    
   

    
  }
  
  public static void m1() {
    //스태틱 맴
    A obj = new A();
    //B obj2 = new B(); 컴파일 올 
    //C obj3 ; //컴파일오류
    //obj3 = new C); 컴파일 오류
    
  }

}
