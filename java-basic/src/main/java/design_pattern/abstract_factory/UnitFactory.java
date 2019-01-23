package design_pattern.abstract_factory;
//추상 팩토리 = 팩토리 사용 규칙만 정의
// => 생산 방식은 같지만 주제에 따라 생산품을 달라진다.
// => 생산 방식이 같으려면 메서드의 사용법이 같아야 한다.
// 

public interface UnitFactory {
  //인터페이스의 필드는 모두  public static final 이다
  
  int RESTAURANT = 1;
 int TRAINING_CENTER =2;
  
  //공장 객체사용규칙
 // 유닛을 생성하고 싶으면 createUnit()을 호출
 // 사용 규칙은 메서드 시그너쳐만 선언하다 .구현하지 않는다.
 // ==> 규칙이기에 무조건 public 으로 공개된다. 
 // 추상메서드이다
  public Unit createUnit(int building);  
}
