package algorithm.data_structure.queue2;

import algorithm.data_structure.linkedlist3.LinkedList;

//기존 기능을 활용하는 가ㅂ
public class Queue<E> extends LinkedList<E> {
  
  public void offer(E value) {
    this.add(value);
    
 
  }

  public Object poll() {
   return this.remove(0);
  }//값을 거내라
  
  public boolean empty() {
    return size==0;
  }
  
  //상속 받은 필드나 메서드를 사용하여 값을 리턴하라
}
