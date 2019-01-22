package ch18.h;
//인터페이스를 직접 구현하면 인터페이스에서 선언된 모든메서드를 정의해야하지만.
//
public class BallPen153 extends AbstractPen {

  @Override
  public void write(String text) {
    if(!this.use)
      return;
    System.out.println("모나미153"+ text);
  }

  
  
}
