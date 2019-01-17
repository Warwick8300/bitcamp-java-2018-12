package ch12.b;
// getter setter 을 적용 해야하는 이유 

public class Test03 {

  public static void main(String[] args) {
   Score s1 = new Score();
   s1.name = "홍길동";
   s1.kor = 100;
   s1.eng = 90;
   s1.math = 80;
   s1.compute();
   System.out.printf("%d %.1f\n",s1.getSum(),s1.getAver());
  
   System.out.println("+======================");
   s1.kor = 70;
   System.out.printf("%d %.1f\n",s1.getSum(),s1.getAver());
   s1.eng = -200;
   s1.compute();

   // 이번에는 점수를 변경한 후 
   System.out.printf("%d %.1f\n",s1.getSum(),s1.getAver());
   
   
   
   
  }

  

}
