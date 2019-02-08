package design_pattern.observer.after2;

public class SunRoofCloseCarObserver extends AbstractCarObserver {

  public SunRoofCloseCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void carStopped() {
    System.out.println("선루프를 닫는다");
    
  }

}
