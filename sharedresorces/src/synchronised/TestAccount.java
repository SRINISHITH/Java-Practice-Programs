package synchronised;

public class TestAccount
{
  public static void main(String[] args)
  {
	Account acc = new Account(20000);
	Account2 acc2 = new Account2(10000);
	
	WithdrawThread wt = new WithdrawThread(acc,1000);
	wt.start();
	DepositThread dt = new DepositThread(acc,2000);
	dt.start();
	WithdrawThread wt2 = new WithdrawThread(acc2,1000);
	wt2.start();
	DepositThread dt2 = new DepositThread(acc2,2000);
	dt2.start();
	
	
  }
}
