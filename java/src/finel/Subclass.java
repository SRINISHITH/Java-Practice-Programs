package finel;

public class Subclass extends Class
{
	public int getBalance()             
	{
		return 10089;
	}
	public static void main(String[] args) {
		Subclass sc=new Subclass();
		System.out.println(sc.getBalance()); 

}
}
