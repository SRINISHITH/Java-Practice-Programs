package statice;

public class Employee 
{
	private static int count=0;
	public Employee()  
	{
		count++;
	} 
	public static int getcount()
	{
		return count;
	}


}
