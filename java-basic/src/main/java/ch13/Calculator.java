package ch13;

public class Calculator {
  
  //캡슐화  private
  // modifier (변경자,한정자)
  protected int result;
  public void plus(int value) {
   this.result += value;
  }
  public void minus(int value) {
    this.result += value;
  }
  public int getResult() {
    return result;
  }
  public void setResult(int result) {
    this.result = result;
  }
}
