package design_pattern.observer.after2;

public class EngineOilCarObserver extends AbstractCarObserver {

  public EngineOilCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void carStart() {
    System.out.println("엔진 오일 여부 검사");
    
  }

  

}
