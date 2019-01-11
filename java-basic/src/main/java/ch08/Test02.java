package ch08;
// 클래스 필드와 Method Area 메모리 영역
class My2  {
  String name;
  int age;
  String userType;
  static String manager = "관리자";
  static String member = "회원";
  static String guest = "손님";

}

public class Test02 {

  public static void main(String[] args) {

    My2.manager = "화가";

  }
}
