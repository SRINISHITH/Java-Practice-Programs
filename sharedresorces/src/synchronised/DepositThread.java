package synchronised;

public class DepositThread extends Thread
{
	private Account account;
	private Account2 account2;
	private int amount;
	private int amount2;
	public DepositThread(Account account, int amount)
	
	{
		this.account=account;
		this.amount=amount;
	}
	public DepositThread(Account2 account2, int amount2)
	{
		this.account2=account2;
		this.amount2=amount2;
	}	
	 public void run()
	 {
		 account.deposit(amount);
		 account2.deposit(amount2);
	 }
}
  