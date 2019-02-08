package design_pattern.observer.after;

import java.util.HashSet;

public class Car {

  
  HashSet<CarObserver> observers= new HashSet<CarObserver>();
  public void addObserver(CarObserver observer) {
    observers.add(observer);
  }
  public void removeObserver(CarObserver observer) {
    observers.remove(observer);
  }
  public void notifyObserverOnStarted() {
    for(CarObserver observer :observers) {
      observer.carStart();
    }
  }
  public void notifyObserverOnStopped() {
    for(CarObserver observer :observers) {
      observer.carStopped();
    }
  }


  public void start() {
    System.out.println("시동을건다");
    notifyObserverOnStarted();

  }
  public void run() {
    System.out.println("달린");
  }
  public void stop() {
    
    System.out.println("시동을끈다");
    notifyObserverOnStopped();

   



  }

  public Car() {
    // TODO 자동 생성된 생성자 스텁
  }

}
