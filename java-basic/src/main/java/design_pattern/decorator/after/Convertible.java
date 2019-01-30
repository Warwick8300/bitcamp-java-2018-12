package design_pattern.decorator.after;

public class Convertible extends Decoator{

  public Convertible(Car car) {
    super(car);
    // TODO 자동 생성된 생성자 스텁
  }
  boolean openRoof;


  @Override
  public void run() {
    //생성자에서 받은 자동차에 덧붙인 지붕 열기 기능을 실행
    if(this.openRoof) {
      System.out.println("지붕을 연다");
    }else {
      System.out.println("지붕을 닫는다.");
    }
    
    
    this.car.run();
    
  }
  public void openRoof(boolean openRoof) {
    this.openRoof = openRoof;
  }

}
