package design_pattern.observer.after;

public class BreakOilCarObserver implements CarObserver {

  public BreakOilCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void carStart() {
    System.out.println("브레이크 오일 유무 검사");
    
  }

  @Override
  public void carStopped() {
    // TODO 자동 생성된 메소드 스텁
    
  }

}
