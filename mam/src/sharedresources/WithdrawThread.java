package sharedresources;
public class WithdrawThread extends Thread
{
	private Account account;
	private int amount;
	
	public WithdrawThread(Account account, int amount)
	{
		this.account=account;
		this.amount=amount;
	}
	 public void run()
	 {
		 account.withdraw(amount);
		 
	 }

}
