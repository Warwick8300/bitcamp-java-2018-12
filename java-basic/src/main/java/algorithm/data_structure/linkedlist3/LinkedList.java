package algorithm.data_structure.linkedlist3;
//제네닉 적용하기


//E에 타입 가정
//E가 뭔타입인지는 linkedlist를 사용할때 결정
public class LinkedList<E> {
  protected Node<E> head;
  protected Node<E> tail;
  protected int size;
  public LinkedList() {
    head = new Node<>();
    tail = head;
    size = 0;
  }

  public void add(E value) {
    tail.value = value;
    // 새 노드를 준비한다.
    Node<E> node = new Node<>();

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
  public E get(int index) {
    if(index < 0 || index >= size)
      return null;
    Node<E> cursor = head;
    // 해당인덱스로 이동한다.
    for(int i = 1 ; i <= index; i++) {
      cursor = cursor.next;
    }
    //cursor가 가르키는 노드의 값을 리턴
    return (E) cursor.value;


  }

  //교체할 값이 들어 있는 노드로 이동한다.
  public E set(int index, E value) {
    if(index < 0 || index >= size)
      return null;
    Node<E> cursor = head;
    // 해당인덱스로 이동한다.
    for(int i = 1 ; i <= index; i++) {
      cursor = cursor.next;
    }

    E old = (E) cursor.value;
    cursor.value = value;    
    return old;

  }

  public E[] toArray() {
    Object[] arr= new Object[size()];
    Node<E> cursor = head;
    int i = 0;
    while(cursor != tail) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    return (E[]) arr;
  }
  //값을 삽입하는 경우는 arraylist방식 보다 효율적이다
   public int insert(int index, E value) {
    if(index < 0 || index >= size)
      return -1;
    Node<E> node = new Node<>(value);
    Node<E> cursor = head;
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

    
    size++;


    return 0;
  }
  public E remove(int index) {
    if(index < 0 || index >= size)
      return null;
    Node<E> cursor = head;
    for(int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    if(cursor.prev != null)
      cursor.prev.next = cursor.next;
    else
      head = cursor.next;


    cursor.next.prev = cursor.prev;
    /// 가비지 처리

    E old = (E) cursor.value;
    cursor.value = null;
    cursor.next = null;
    cursor.prev = null;
    size --;
    return old;


  }


  public int size() {
    return size;
  }

  //node가 다루는 타입을 제네릭 으로 선언한다 
  
  private static class Node<E> {
    //Linkedlist 내부에서만 사용하기 떄문에 node의 맴버를 public  공개 필요 없다
    Object value;
    Node<E> next;
    Node<E> prev;
    Node() {}
    Node(E value) {
      this.value = value;
    }

  }





}
