package design_pattern.chain_of_responsibility;

public class TerminalHandler extends AbstractHandler {

  @Override
  public void handle(int a, int b, String op) {
   System.err.println("해당 연산자를 지원못함"); 
  
  }


}
