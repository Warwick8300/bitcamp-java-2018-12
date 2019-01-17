package com.eomcs.lms.handler;

import java.util.Arrays;


public class ArrayList {
  static final int DEFAULT_CAPACITY = 10;
  Object[] arrlist;
  int size = 0;

  public ArrayList() {
    arrlist  = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY)
      arrlist = new Object[initialCapacity];
    else
      arrlist = new Object[DEFAULT_CAPACITY];
  }

  public Object[] toArray() {
    return Arrays.copyOf(arrlist, size);
  }

  public void add(Object obj) {
    if (size >= arrlist.length) {
      int oldCapacity = arrlist.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      arrlist = Arrays.copyOf(arrlist, newCapacity);
    }

    arrlist[size++] = obj;
  }
}
