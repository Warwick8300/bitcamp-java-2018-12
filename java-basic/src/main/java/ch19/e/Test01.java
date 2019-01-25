package ch19.e;

public class Test01 {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(400);
    list.add(500);
    list.add(600);
    LinkedList list2 = new LinkedList();
    list2.add(10);
    list2.add(20);
    list2.add(30);
    list2.add(40);
    list2.add(50);
    list2.add(60);
    // list에 들어 있는 값을 꺼내자
    Object[] arr = list.toArray(LinkedList.FORWARD);
    
    //배열을 다랄고 요청후 array에 자신의 주소를 알려주며 자신이 갖고 있는 값을 꺼낸다.
    for( Object obj :arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
    
    Object[] arr2 = list.toArray(LinkedList.REVERSE);
    
    for( Object obj :arr2) {
      System.out.print(obj + ",");
    }
    System.out.println();
    
    
Object[] arr3 = list2.toArray(LinkedList.REVERSE);
    
    for( Object obj :arr3) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
