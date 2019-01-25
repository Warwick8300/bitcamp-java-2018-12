package ch19.d;
//static nested class 문법을 이용하여 응용
public class Category {


  static class computer{
    public static class mouse{
      public static final int bluetooth = 111;
      public static final int gaming = 112;
      public static final int wired = 113;
      public static final int trackball = 114;
    }
    
    public static final int keyboard = 102;
    public static final int monitor = 103;
    public static final int cpu = 104;
    public static final int ram = 105;
    public static final int vga = 106;
  }
  
  static class appliance{
  public static final int TV = 201;
  public static final int AUDIO= 202;
  public static final int DVD = 203;
  public static final int VACUUM = 204;
  }
  static class Book{
  public static final int poet = 301;
  public static final int novel = 302;
  public static final int it = 303;
  public static final int lang = 304;
}

}
