package design_pattern.observer.after2;

public class SafeBeltCarObserver extends AbstractCarObserver  {

  public SafeBeltCarObserver() {
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void carStart() {
    System.out.println("안전벨트 착용 여부 검사");
    
  }

}
