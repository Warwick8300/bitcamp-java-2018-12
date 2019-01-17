package ch12.b;

public class Calculator {
  
  //캡슐화  private
  // modifier (변경자,한정자)
  private int result;
  public void plus(int value) {
    this.setResult(this.getResult() + value);
  }
  public void minus(int value) {
    this.setResult(this.getResult() - value);
  }
  public int getResult() {
    return result;
  }
  public void setResult(int result) {
    this.result = result;
  }
}
