package ch19.f;
// Array클래스는 linkedlist 클래스에서만 사용한다.
// 즉 LinkedList 클래스 안에 array 클래스를 정의 
public class LinkedList {
  public static final int FORWARD = 1;
  public static final int REVERSE = 2;
  
  protected Node head;
  protected Node tail;
  protected int size;
  public LinkedList() {
    head = new Node();
    tail = head;
    size = 0;
  }

  public void add(Object value) {
    tail.value = value;
    // 새 노드를 준비한다.
    Node node = new Node();

    //마지막 노드의 다음 노드로 새 노드를 가리키게 한다.
    tail.next = node;

    //새 노드의 이전으로 마지막 노드를 가리키게 한다.
    node.prev = tail;

    //새 노드의 이전으로 마지막 노트를 가리키게한다.
    tail = node;

    // 항목 개수를 증가시킨다
    size ++;

  }

  //ArrayList와 달리 해당 인덱스를 찾아 가려면 링크를 따라 가야하기 떄문에 조회속도가느리
  public Object get(int index) {
    if(index < 0 || index >= size)
      return null;
    Node cursor = head;
    // 해당인덱스로 이동한다.
    for(int i = 1 ; i <= index; i++) {
      cursor = cursor.next;
    }
    //cursor가 가르키는 노드의 값을 리턴
    return cursor.value;


  }

  //교체할 값이 들어 있는 노드로 이동한다.
  public Object set(int index, Object value) {
    if(index < 0 || index >= size)
      return null;
    Node cursor = head;
    // 해당인덱스로 이동한다.
    for(int i = 1 ; i <= index; i++) {
      cursor = cursor.next;
    }

    Object old = cursor.value;
    cursor.value = value;    
    return old;

  }

  public Object[] toArray(int direction) {
    Array helper = new Array();
    if (direction == FORWARD) {
      return helper.copy();
    }else {
      return helper.reverseCopy();
    }
  }
  //값을 삽입하는 경우는 arraylist방식 보다 효율적이다
  public int insert(int index, Object value) {
    if(index < 0 || index >= size)
      return -1;
    Node node = new Node(value);
    Node cursor = head;
    for(int i = 1; i <= index ;i++) {
      cursor = cursor.next;
    }
    
    node.next = cursor;
    node.prev =cursor.prev;
   //새노드가 찾은 노드를 가리키게 한다.
    cursor.prev = node;
    if(node.prev != null)
      node.prev.next =node;
     
    else {
      head = node;
    }
    
    //
    size++;

 
    return 0;
  }
  public Object remove(int index) {
    if(index < 0 || index >= size)
      return null;
    Node cursor = head;
    for(int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    
    if(cursor.prev != null)
    cursor.prev.next = cursor.next;
    else
      head = cursor.next;
    
    
    cursor.next.prev = cursor.prev;
    /// 가비지 처리
    
    Object old = cursor.value;
    cursor.value = null;
    cursor.next = null;
    cursor.prev = null;
    size --;
    return old;    
  }
  public int size() {
    return size;
  }
  
  //-----------------------------------------------------
 // static 이냐 non-static이냐
  // 특정 인스턴
  
  private class Array {
    
    public Object[] copy() {
      
      //
      Object[] arr = new Object[LinkedList.this.size()];
      for( int i =0 ;  i< LinkedList.this.size(); i++ ) {
        arr[i] = LinkedList.this.get(i);
      }
      return arr;
    }
    
    //입력된 순서의 반대로 배열을 만든다.
    public Object[] reverseCopy() {
      Object[] arr= new Object[size()];
      for (int j= 0, i = size()-1 ; i >= 0 ; i--, j++) {
        arr[j] = get(i);
      }
      return arr;
    }
  }
  
}
