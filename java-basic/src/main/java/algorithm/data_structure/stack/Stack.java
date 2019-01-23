package algorithm.data_structure.stack;

public class Stack {

  public static final int DEFAULT_SIZE = 5;

  Object[] list;
  int size=0;

  public Stack() {
    list = new Object[DEFAULT_SIZE];
  }

  public void push(Object value) {
    if(size==DEFAULT_SIZE) {
     Object[] temp = new Object[list.length + list.length >>1];
      for (int i = 0; i < this.list.length; i++) {
        temp[i] = this.list[i];
      }
      list = temp;
      // 맨 마지막에 추가한다.
      // 배열의 크기가 작다면 확장해야 한다.
    }
    list[size] = value;
    size++;
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
}
