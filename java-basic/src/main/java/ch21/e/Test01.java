// 사용자 정의 예외 사용하
package ch21.e;

public class Test01 {



  static class MyException extends Exception{

    public MyException() {
      super();
      // TODO 자동 생성된 생성자 스텁
    }

    public MyException(String message, Throwable cause, boolean enableSuppression,
        boolean writableStackTrace) {
      super(message, cause, enableSuppression, writableStackTrace);
      // TODO 자동 생성된 생성자 스텁
    }

    public MyException(String message, Throwable cause) {
      super(message, cause);
      // TODO 자동 생성된 생성자 스텁
    }

    public MyException(String message) {
      super(message);
      // TODO 자동 생성된 생성자 스텁
    }

    public MyException(Throwable cause) {
      super(cause);
      // TODO 자동 생성된 생성자 스텁
    }

  }
  public static void main(String[] args)throws Exception {
    m1();

  }
  static void m1()throws MyException {

    throw new MyException();
  }
}



