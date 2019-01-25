package com.eomcs.util;


//기존 기능을 활용하는 가ㅂ
public class Queue<E> extends LinkedList<E> implements Cloneable {
  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> temp = new Queue<>();
    for(int i = 0; i < this.size(); i++) {
      temp.offer(this.get(i));
    }
    return temp;
  }
  public void offer(E value) {
    this.add(value);
    
 
  }

  public E poll() {
   return this.remove(0);
  }//값을 거내라
  
  public boolean empty() {
    return size==0;
  }
  
  //상속 받은 필드나 메서드를 사용하여 값을 리턴하라
}
