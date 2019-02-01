package ch22.c;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream {
  InputStream in;
  byte[] buf = new byte[1];
  int cursor = 0;
  int size = 0;
  
  public BufferedInputStream(InputStream in) {
    this.in = in;
  }
  public int read() throws IOException {
    if(cursor >= size) {
      size = in.read(buf);
      if(size == -1)
        return -1;
    cursor = 0 ;
    }
      
    return buf[cursor++] & 0xff;
  }


}
