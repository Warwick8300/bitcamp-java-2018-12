package ch23.c;

public class test1 {

  public static void main(String[] args) {
    String test = " 123 - 7";
        
   if(test.contains("+"))
     System.out.println("+");
   else if(test.contains("-"))
     System.out.println("-");
   else if(test.contains("/"))
     System.out.println("/");

  }

}
