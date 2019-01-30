package design_pattern.decorator.after;

public class Dump extends Decoator{

  
  public Dump(Car car) {
    super(car);
    // TODO 자동 생성된 생성자 스텁
  }

  @Override
  public void run() {
    //생성자에서 받은 자동차에 덧붙인 짐내리기 기능을 실행
    this.car.stop();
    this.dump();
    
      System.out.print("전기모터를 켜고");
    // 생성자에서 받은 원래의 자동차를 실행
    this.car.run();
    
  }
  public void dump() {
    System.out.println("짐을 내린다.");
  }
}
