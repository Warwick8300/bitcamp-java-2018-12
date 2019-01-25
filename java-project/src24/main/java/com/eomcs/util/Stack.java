package com.eomcs.util;

public class Stack<E> implements Cloneable {

  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone()  {
    // Object에서 상속 받은 clone()은 
    // 인스턴스 필듸으 값만 복제한다.
    // 인스턴스필드가 가리키는 다른 인스턴스는 복제하지 않는다.
    // 예를 들어 Stack의 list 배열 레퍼런스가 가리키는 배열 인스턴스는 복제하지 않는다 .
    // 배열 인스턴스 까지 복제(deep clone()하려면 
    Stack<E> temp = new Stack<E>();
    for(int i = 0; i < this.size(); i++) {
      temp.push((E)list[i]);
    }
    return temp;
  }

  
  public static final int DEFAULT_SIZE = 5;

  Object[] list;
  int size=0;

  public Stack() {
    list = new Object[DEFAULT_SIZE];
  }

  public void push(E value) {
    if (size == list.length) {
      Object[] arr = new Object[list.length + (list.length >> 1)];
      for (int i = 0; i < list.length; i++) {
        arr[i] = list[i];
      }
      list = arr;
    }
    
    list[size++] = value;
    Queue<String> q ;
    
  }

  public Object pop() {
    if (size == 0)
      return null;
    
    return list[--size];
  }

  public boolean empty() {
    return size==0;
  
  }

  public int size() {
    return this.size;
  }
  public Iterator<E> iterator() {
    return new Iterator<E> (){
      int index = 0;
      @Override
      public boolean hasNext() {
        return index < size();
      }
      @SuppressWarnings("unchecked")
      @Override
      public E next() {
        int lastIndex = size - 1;
        return (E) list[lastIndex - (index++)];
      }
    };
  }
  
}
