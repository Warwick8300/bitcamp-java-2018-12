package ch18.h;
//인터페이스 구현 - 인터페이스에 선언된 모든 메서드를 정의해야한다.

public class MyPen implements Pen{

  boolean use;
  
  @Override
  public void on() {
    // TODO 자동 생성된 메소드 스텁
    this.use = true;
  }

  @Override
  public void off() {
    // TODO 자동 생성된 메소드 스텁
    this.use = false;
  }

  @Override
  public void write(String text) {
    // TODO 자동 생성된 메소드 스텁
    if(!this.use)
      return;
    System.out.println("==>" + text);
  }

}
