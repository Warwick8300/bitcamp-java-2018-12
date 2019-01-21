package com.eomcs.util;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;


public class ArrayList<E> {
  static final int DEFAULT_CAPACITY = 10;
  Object [] arrlist;
  int size = 0;

  public ArrayList() {
    arrlist = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(E[] arr, int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY)
      arrlist =new Object[initialCapacity];
    else
      arrlist = new Object[DEFAULT_CAPACITY];
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] sampleArr) {
    return (E[]) Arrays.copyOf(arrlist, size,sampleArr.getClass());
    
    /*
    E[] arr =Arrays.copyOf(sampleArr, size);
    for(int i = 0; i <size ;i++) {
      arr[i] = (E) arrlist[i];
    }
    return arr;
    */
  }

  public void add(E obj) {
    if (size >= arrlist.length) {
      int oldCapacity = arrlist.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      arrlist = Arrays.copyOf(arrlist, newCapacity);
    }

    arrlist[size++] = obj;
  }
  
  public E get(int index) {
    //int index = i-1; 
    if((E) arrlist[--index] ==null)
    {
      return null;
    }
    return (E) arrlist[index];
    //index : 값을 꺼낼 배열의 항목 위치
  }
  
  public E set(int index, E value) {
    arrlist[--index] = value;
    return (E) arrlist[index];
  }
  

 
  public E remove(int index) {
    //index :삭제할 배열의 항목위치
    //리턴값: 삭제된 이전값
    return null;
  }
}
