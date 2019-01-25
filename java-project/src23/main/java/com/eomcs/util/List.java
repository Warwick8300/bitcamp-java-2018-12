package com.eomcs.util;
// 데이터 관리 객체의 사용 규칙을 정의하기  (Arraylist ,Linkedlist


public interface List<E> {
  Object[] toArray();
  <T> T[] toArray(T[] a);
  void add(E value);
  E get(int index);
  E set(int index, E obj);
  E remove(int index);
  int size(); 
}
