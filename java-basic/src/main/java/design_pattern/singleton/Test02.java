package design_pattern.singleton;

class Car2{
  String model;
  int cc;
  private static Car2 instance;

  //1)생성자를 정의하고 private 를 선언하여 비공개로 만들어라.
  private Car2() {}
  //q비공개 생성자를 외부에서 호출할 수 없다.
  public static Car2 getInstance() {
    if(Car2.instance == null) {
      Car2.instance = new Car2();
    }
    return Car2.instance;
  }
}
public class Test02 {

  public static void main(String[] args) {

    //생성자가private
    //Car2 c1 = new Car2();
    Car2 c1 = Car2.getInstance();
    Car2 c2 = Car2.getInstance();
    
    
    if(c1 != c2)
      System.out.println("다르다");
    else
      System.out.println("같다");
    System.out.println(c1);
    System.out.println(c2);

  }
}
