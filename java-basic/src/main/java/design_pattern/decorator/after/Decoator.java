package design_pattern.decorator.after;


//자동차에 추가기능을 덧붙이는 역활을 한다.
public abstract class Decoator extends Car {
  Car car;
  //비록 Car를 ㅏㅇ속 받았지만 스스로 car일을 하지 않는다.
  //단지다른 자동차에 기능을 덧붙이다.
  //생성자에서 반드시 기능을 덧붙일 대상이 되는 자동차를 받아야 한다.
  public Decoator(Car car) {
    this.car = car;
  }
}
