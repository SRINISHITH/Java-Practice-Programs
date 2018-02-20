package inputstream;
import java.io.IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
public class FileRead 
{
  public void fileread(String source) 
  {
	  FileInputStream inputstream = new FileInputStream(source);
    int b=0;
    	while((b=inputstream.read())!=-1);
    	{
         //System.out.println(b);    		
          System.out.println(Character.toChars(b));    		 
    	}	
  }
}
    	
    	
    	
    	
    	
   

