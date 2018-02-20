package userdefined;

public class TestAccount 
{
  public static void main(String[] args) 
  {
	Account ac = new Account();
	try {
		ac.withdraw(4000);
	} catch (UserDefinedException e) {
		e.printStackTrace();
	}
	System.out.println("successful transaction");
}
}
