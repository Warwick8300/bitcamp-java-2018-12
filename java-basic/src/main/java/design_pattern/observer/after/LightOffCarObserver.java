package design_pattern.observer.after;

public class LightOffCarObserver implements CarObserver {

  public LightOffCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void carStart() {
 
    
  }

  @Override
  public void carStopped() {
    System.out.println("전조등을 끈다.");
    
  }

}
