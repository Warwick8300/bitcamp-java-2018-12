package design_pattern.observer.after2;

public class LightOffCarObserver extends AbstractCarObserver {

  public LightOffCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }


  @Override
  public void carStopped() {
    System.out.println("전조등을 끈다.");
    
  }

}
