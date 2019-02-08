package design_pattern.observer.after2;

public interface CarObserver {
  
  // -> 보통 메서드의 이름은 동사로 시작하는데
  void carStart();
  void carStopped();
}
