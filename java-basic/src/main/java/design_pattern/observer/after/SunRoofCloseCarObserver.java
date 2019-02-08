package design_pattern.observer.after;

public class SunRoofCloseCarObserver implements CarObserver {

  public SunRoofCloseCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void carStart() {
 
    
  }

  @Override
  public void carStopped() {
    System.out.println("선루프를 닫는다");
    
  }

}
