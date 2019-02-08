package design_pattern.observer.after;

public class EngineOilCarObserver implements CarObserver {

  public EngineOilCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void carStart() {
    System.out.println("엔진 오일 여부 검사");
    
  }

  @Override
  public void carStopped() {
    // TODO 자동 생성된 메소드 스텁
    
  }

}
