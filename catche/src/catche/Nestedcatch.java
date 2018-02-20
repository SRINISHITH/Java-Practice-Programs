package catche;

public class Nestedcatch
{
	public static void main(String[] a)
	{
      Float result=0f;
      try
      {
    	  result = Float.parseFloat(a[0])/Float.parseFloat(a[1]);
      }
      catch(NumberFormatException e)
      {
    	  System.out.println("give valid input");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
    	  System.out.println("provide both values");
      }
      catch(ArithmeticException e)
      {
    	  System.out.println("give valid input");
      }
      System.out.println(result);
	}
}

