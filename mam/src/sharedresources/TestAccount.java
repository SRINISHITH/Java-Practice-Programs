package sharedresources;

public class TestAccount
{
	public static void main(String[] args)
	  {
		Account acc = new Account(20000);
		
		WithdrawThread wt = new WithdrawThread(acc,1000);
		wt.start();
		DepositThread dt = new DepositThread(acc,2000);
		dt.start();
	  }		
}
