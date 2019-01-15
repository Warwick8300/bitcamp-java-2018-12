package ch10;
public class Queue{
  private final int MAX_SIZE = 5;
  private int front, rear;
  private int[] queue;
  public Queue() {
    front = rear = -1;
    queue = new int [MAX_SIZE];
  }
  
  private boolean isEmpty() {
    return front == rear ? true : false;
  }
  private boolean isFull() {
    return rear == MAX_SIZE-1 ? true : false;
  }
  
  public void enqueue(int data) {
    if(isFull())
      return;
    else
      queue[++rear] = data;
  }
  public int dequeue() {
    if(isEmpty())
      return -1;
    else
      return queue[++front];
    }
  public void display() {
    System.out.print("Queue : ");
    for (int idx = front + 1 ; idx <= rear ;idx++)
      System.out.print(queue[idx] + " ");
    System.out.println();
  }
  
  public static void main(String[] args) {
    Queue q1 = new Queue();
    
    q1.enqueue(5);
    q1.enqueue(3);
    q1.enqueue(2);
    q1.enqueue(1);
    q1.enqueue(0);
    q1.enqueue(3);
    q1.enqueue(2);
    q1.display();
    q1.dequeue();
    q1.display();
    q1.dequeue();
    q1.display();
    q1.enqueue(5);
    q1.display();
    q1.dequeue();
    q1.display();
    q1.dequeue();
    q1.display();
    q1.enqueue(2);
    q1.display();
    
    
    q1.display();
  }
}

