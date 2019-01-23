package design_pattern.template_method;
// 템플릿 메서드 패턴 - 수퍼 클래스에 실행 흐름을 정의하고 서브 클래스에 세부 항목을 구현한다.

public class Test01 {

  public static void main(String[] args) {

    //식당 짓기
    Restaurant u1= new Restaurant();
    u1.setName("군인식당");
    u1.setArea(50);
    u1.setType(Unit.GENERAL_BUILDING);
    u1.build(); // 수퍼클래스에서 상속 받은 메서드를 호출한다.
    //
    
    System.out.println("---------------------------------------");
    //훈련소 짓기
    TrainingCenter u2= new TrainingCenter();
    u2.setName("훈련소");
    u2.setArea(500);
    u2.setType(Unit.GENERAL_BUILDING);
    u2.build();

  }

}
