package design_pattern.abstract_factory;

//이클래스는 직접 사용할 클래스가 아니다.
/// 건물을 짓는데 필요한 기본 필드와 메서드를 서브 클래스에게 상속해주는 용도로 사용한다.
// 일부 메서드는 추상 메서드이다.
// 따라서 이 클래스는 추상 클래스이어야하낟.

//슈퍼 클래스에서 기본 흐름을 정의한다.
//그래서 build 메서드는 구현메서드로 정의한다.
//결국 이 클래스는 특정 빌딜을 짓는 서브 클래스를 만들기 위한 틀(template)
//
// 서브 클래스가 구현해야 할 툴

public abstract class Unit {
  
  // 상수 건물의 type값을 지정할 때 
  public static final int GENERAL_BUILDING = 0;
  public static final int DEFENCE_BUILDING = 1;
  public static final int ATTACK_BUILDING = 2;
  
  
  protected String name;
  protected int area;
  protected int type;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getArea() {
    return area;
  }
  public void setArea(int area) {
    this.area = area;
  }
  public int getType() {
    return type;
  }
  public void setType(int type) {
    this.type = type;
  }
  public void build() {
    prepare(); //건물을 지을 땅을 준비하낟.
    construct();// 건물 뼈대를 짓는다.
    install(); //배선 및 단열, 외장을 설치
    interio(); //내부인테리어를한다.
  }
  //유닛의 종ㄹ에 따라 건물을 짓는 방식이 다르기 때문에
  // 구체적인 작업은 서브 클래스에게 맡긴다.
  // 따라서 build가 호출하는 메서드는 추상 메서드로 선언한다.
  public abstract void prepare();
  public abstract void construct();
  public abstract void install();
  public abstract void interio();


}
