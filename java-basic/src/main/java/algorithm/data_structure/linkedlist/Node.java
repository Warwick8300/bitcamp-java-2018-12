package algorithm.data_structure.linkedlist;

// LinkedList 에서 다룰 데이터를 담는 그릇이다.

public class Node {
  public Object value;
  public Node next;
  public Node prev;
  
  
  public Node() {}
  
  public Node(Object value) {
    this.value = value;
  }
  public Node(Object value, Node prev, Node next) {
    this(value);
    this.next = next;
    this.prev = prev;
  }
}