package out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Fcopy 
{
  public void copy(String source,String destination) throws IOException
  {
	  FileInputStream input = new FileInputStream(source);

	  FileOutputStream output = new FileOutputStream(destination);
	  int b = 0;
	  while(( b = InputStream.read())!=-1)
      {
	    System.out.println(Character.toChars(b)); 
	    OutputStream stream.write(b);
      }
     
  }

private void write(int b) {
	// TODO Auto-generated method stub
	
}
}
