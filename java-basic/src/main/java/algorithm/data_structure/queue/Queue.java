package algorithm.data_structure.queue;

import algorithm.data_structure.linkedlist.LinkedList;
import algorithm.data_structure.linkedlist.Node;

//기존 기능을 활용하는 가ㅂ
public class Queue extends LinkedList {
  
  public void offer(Object value) {
    super.add(value);
    
 
  }

  public Object poll() {
   return super.remove(0);
  }//값을 거내라
  
  public boolean empty() {
    return size==0;
  }
  
  //상속 받은 필드나 메서드를 사용하여 값을 리턴하라
}
