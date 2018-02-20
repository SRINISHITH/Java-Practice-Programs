package catche;

public class Multicatch
{
	public static void main(String[] a)
	{
      Float result=0f;
      try
      {
    	   result = Float.parseFloat(a[0])/Float.parseFloat(a[1]);
      }
      catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e)
      {
    	  System.out.println("provide valid value");
        e.printStackTrace();
      }
       System.out.println(result);
	}
  
}
