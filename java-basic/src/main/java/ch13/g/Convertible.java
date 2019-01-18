package ch13.g;
//상속 specialization
public class Convertible extends Car {
    boolean open;
    public void openRoof() {
      open = true;
    }
    
    public void closeRoof() {
      open = false ;
    }
  
}
