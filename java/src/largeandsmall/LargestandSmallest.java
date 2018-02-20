package largeandsmall;

public class LargestandSmallest 
{		 		
		    public void fin(int a, int b, int c) {
		        int max = a;
		        if (b > max) 
		        {
		            max = b;
		        }
		         if (c > max) 
		         {
		            max = c;
		         }
		          int min = a;
		        if (b < min) 
		        {
		            min = b;
		        }
		        if (c < min) 
		        {
		            min = c;
		        }
		        System.out.println("Largest of the three numbers is " + max);
		        System.out.println("Smallest of the three numbers is " + min);
		    }
}
