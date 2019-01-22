package algorithm.data_structure.array;


import java.util.List;

public class ArrayList {
  
 
  static final int DEFAULT_SIZE = 5;
  Object[] arr;
  int size=0;
  public ArrayList() {
    this(0);
  }
  
  public Object[] toArray() {
    Object[] list = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      list[i] = this.arr[i];
    }
    return list;
  }
  /*
  public Object[] toArray() {
    return Arrays.copyOf(arr, size, arr.getClass());
  }
  */
  public ArrayList(int capacity) {
    if(capacity > DEFAULT_SIZE)
    {
      arr=new Object[capacity];
    }
    else
      arr = new Object[DEFAULT_SIZE];
  }

  public void add(Object value) {
    if (size >= arr.length)
      increase();
    arr[size++] = value;
    
    
  }//현재 배열이 꽉찼다면 현재 배열 크기의 50% 만큼 증가시켜라

  public int insert(int index, Object value) {
    if (index < 0 || index >= size)
      return -1;
    if (size >= arr.length)
      increase();
    for (int i = size; i >= index; i--)
      arr[i] = arr[i-1];
    size++;
    arr[index] = value;
    return 0;
    //유효 인덱스(현재배열에 데이터가 저장된 방번호)가 아니면 null을 리턴하라
  //현재 배열이 꽉찼다면 현재 배열 크기의 50% 만큼 증가시켜라
  }// 삽입할 위치에 항목 부터 이후의 항목들을 뒤로 민다.
  
  public Object get(int index) {
    if (index < 0 || index >= size)
      return null;
    return arr[index];
    
  }//유효 범위가아니면 null를 리턴하라

  public Object set(int index, Object value) {
    if (index < 0 || index >= size)
      return null;
    
    Object obj = arr[index];
    arr[index] = value;
    return obj;
    //유효 인덱스 (현재 배열에 데이터가 저장된 방번호)가아니면 변경하지말라 리턴값을 null이다
  }
  public Object remove(int index) {
    if (index < 0 || index >= size)
      return null;
    Object obj = arr[index];
    for (int i = index; i < size - 1; i++)
      arr[i] = arr[i + 1];
    size--;
    return obj;
    //유효 인덱스가 아니면 삭제하지말라
    //삭제한 후 다음 항목을 앞으로 당긴다.
  }
  public int size() {
    return this.size;
  }
  
  void reverse() { //스태틱
    Object[] temp; 
    int oldsize = this.size()-1;
    temp = new Object[arr.length];
    for(int i = 0;i < this.size(); i++)
    {
      temp[oldsize--] = arr[i];
    
    }
    arr = temp;
  }

  private void increase() {
    int originSize = arr.length;
    int newSize = originSize + (originSize >> 1);
    Object[] temp = new Object[newSize];
    for (int i = 0; i < this.arr.length; i++) {
      temp[i] = this.arr[i];
    }
    arr = temp;
  }
  /*
  private void increase() {
    int oldCapacity = arr.length;
    int newCapacity = oldCapacity + (oldCapacity >> 1);
    arr = Arrays.copyOf(arr, newCapacity);
  }
  */
  

}
