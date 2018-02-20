package synchronised;

public class WithdrawThread extends Thread
{
	private Account account;
	private int amount;
	private Account2 account2;
	private int amount2;
	
	public WithdrawThread(Account account, int amount)
	{
		this.account=account;
		this.amount=amount;
	}
	public WithdrawThread(Account2 account2, int amount2)
	{
		this.account2=account2;
		this.amount2=amount2;
	}
	 public void run()
	 {
		 account.withdraw(amount);
		 account2.withdraw(amount2);
		 
	 }
}
