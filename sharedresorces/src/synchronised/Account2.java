package synchronised;

public class Account2
{
	int balance;
	 public Account2(int balance)
	 {
		 this.balance=balance;
	 }
	 public void withdraw(int amount)
	 {
		 balance= balance - amount;
		 System.out.println("After withdraw account2 amount is ="+ amount);
		 System.out.println("After withdraw account2 account balance is=" + balance);
		 
	 }
	 public void deposit(int amount)
	 {
		 balance= balance + amount;
		 System.out.println("After deposit account2 amount ="+ amount);
		 System.out.println("The balance in account2 is=" + balance);
		 
	 }
}
