package arithmatic;

public class ArithmaticException 
{
/* public float divide(int x ,int y)
 {
	 return x/y; 
 }
  public static void main(String[] args) 
  {
	  ArithmaticException ex = new ArithmaticException();
			    System.out.println(ex.divide(20,5));
        // to generate exception place 0 instade of 5
	            System.out.println(ex.divide(20,0));
	    // to handle exception we us try and catch method        
	  
  }*/
	 public static double divide(int x ,int y)
	 {
	    try
	    {
		 return x/y; 
    	}
	      catch(ArithmeticException e)
	      {
	    	System.out.println("provide valid value");
	        return 1;    
	      }
     }
	 
	  public static void main(String[] args) 
	  {
		  ArithmeticException ex = new ArithmeticException();
			divide(20,10);	    
		  System.out.println(divide(20,0));
	  }
}