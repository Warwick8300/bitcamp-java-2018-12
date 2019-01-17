package ch14.e;

public class SUV extends Sedan {
  int weight;
  
  @Override
  public void run() {
    System.out.println("덜컹덜컹린다.");
  }
}
