package ch12.b;
// 캡슐화 (encapsulation) 필요성 - 사례 1
public class Test02 {

  public static void main(String[] args) {
   Score s1 = new Score();
   s1.name = "홍길동";
   s1.kor = 100;
   s1.eng = 90;
   s1.math = 80;
   s1.compute();
   System.out.printf("%d %.1f\n",s1.getSum(),s1.getAver());
  
   System.out.println("+======================");
   Score s2 = new Score();
   s2.name = "홍길동";
   s2.kor = 100;
   s2.eng = 90;
   s2.math = 80;
   s2.compute();
  
   s2.setAver(95.5f);
   System.out.printf("%d %.1f",s2.getSum(),s2.getAver());
  
  }

  

}
