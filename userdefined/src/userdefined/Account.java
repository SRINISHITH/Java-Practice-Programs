package userdefined;

public class Account
{
  private int balance=5000;
  public void withdraw(int amount) throws UserDefinedException
  {
	  balance=balance-amount;
	  if(balance<2000)
	  {
		  throw new UserDefinedException();
	  }
  }
}
