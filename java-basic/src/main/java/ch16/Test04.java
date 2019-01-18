package ch16;

import java.util.Date;

// 제네릭을 적용하지 않은 클래스 
class Box1 {
  Object value;
  public Box1(Object value) {
    this.value = value;
  }
  public Object getValue() {
    return this.value;
  }
}
// 제네릭을 적용한 클래스
class Box2<T> {
  T value;
  public Box2(T value) {
    this.value = value;
  }
  public T getValue() {
    return this.value;
  }
}

//제네릭(generic) 응용 - 클래스 전체에 응용하기

public class Test04 {

  public static void main(String[] args) {

    Box1 b1 =new Box1(100);
    Box1 b2 =new Box1("hello");
    Box1 b3 =new Box1(new Date());

    int v1 = (int) b1.getValue(); // 오토 박싱
    String v2 =(String) b2.getValue();
    Date  v3  = (Date) b3.getValue();

    Box2<String> x1 = new Box2<String>("홍길동");
    Box2<String> x2 = new Box2<>("임꺽정");
    Box2<String> x3;
    x3= new Box2<String>("호홓호");

    //        Box2<String> x4 = new Box2<>(new Date)// 컴파일오류
    String y1 = x1.getValue();
    String y2 = x2.getValue();
    String y3 = x3.getValue();
    
    Box2<Date> x4 = new Box2<>(new Date());
    Date y4 = x4.getValue();






  }



}
