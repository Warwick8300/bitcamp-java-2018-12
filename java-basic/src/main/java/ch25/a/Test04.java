package ch25.a;
import java.sql.DriverManager;

public class Test04 {

  public static void main(String[] args) {
 
    try {
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb:");
      System.out.println(driver);
    }catch(Exception e) {
    }
    

   
    
    
  }

}
