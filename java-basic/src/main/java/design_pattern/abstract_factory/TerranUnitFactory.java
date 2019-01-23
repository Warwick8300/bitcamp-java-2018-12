package design_pattern.abstract_factory;
//추상 팩토리 규칙에 따라 공장 클래스를 만들기.
// 직접 unitfactory 를 구현해도 되지만 
// 서브클래스에게 상속해줄 필드나 메서드가 있다면 중간에 추상클래스 문법을 적용하여
// 추상 클래스를 만드는 것이 좋다
// 서브 클래스에 상속해줄 ㅣㄹ드나 메서드가 업삳면 직접 인터페이스를 구현한다
public class TerranUnitFactory implements UnitFactory{
  public Unit createUnit(int building) {
   
    switch(building) {
       case RESTAURANT:
         return createRestaurant();
       case TRAINING_CENTER:
        return createTrainingCenter();
        }
    return null;  
  }
  
  
  private Unit createRestaurant() {
    Unit unit = new Restaurant();
    unit.setName("테란 : 군인식당");
    unit.setArea(50);
    unit.setType(Unit.GENERAL_BUILDING); 
    return unit;
  }
  
  private Unit createTrainingCenter() {
    Unit unit = new TrainingCenter();
    unit.setName("테란 : 훈련소");
    unit.setArea(500);
    unit.setType(Unit.GENERAL_BUILDING); 
    return unit;
  }
}
