package ch13.a;

public class Calculator2 {
  // 기존 클래스의 기능을 상속 받겠다고 선언한다.
//곱하기 나누기 기능 추가 
  
//캡슐화  private
 // modifier (변경자,한정자)
 private int result;
 public void plus(int value) {
   this.setResult(this.getResult() + value);
 }
 public void minus(int value) {
   this.setResult(this.getResult() - value);
 }
 
 public void multiple(int value) {
   this.result *= value;
 }
 public void divide(int value) {
   this.result /= value;
 }
 public int getResult() {
   return result;
 }
 public void setResult(int result) {
   this.result = result;
 }
}
