package ch14.a;

public class Score2 extends Score {

 protected int music;
 protected int art;
 
 // 오버라이딩(overriding)
 //상속 받은 메서드를 서브 클래스의 역할에 맞게 재정의하는 문법
 
 @Override
 public void compute()
 {
   this.sum = this.kor + this.eng + this.math + this.music + this.art;
   this.aver = this.sum / 5f;
 }
}
