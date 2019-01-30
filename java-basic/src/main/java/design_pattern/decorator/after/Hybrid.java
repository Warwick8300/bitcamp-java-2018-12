package design_pattern.decorator.after;

public class Hybrid extends Decoator{

  
  public Hybrid(Car car) {
    super(car);
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void run() {
    //생성자에서 받은 자동차에 덧붙인 전기 모터를 기능을 실행
      System.out.print("전기모터를 켜고");
    // 생성자에서 받은 원래의 자동차를 실행
    this.car.run();
    
  }

}
