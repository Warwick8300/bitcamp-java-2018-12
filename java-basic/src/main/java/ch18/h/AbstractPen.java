package ch18.h;
//추상 클래스 활용 - 서브 클래스를 위해 미리 인터페이스를 이부 메서드를 구현하는 역활


//
public abstract class AbstractPen implements Pen{

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

  ///write()는
  /*
  @Override
 public void write(String text) {
    // TODO 자동 생성된 메소드 스텁
    
  }
  */

}
