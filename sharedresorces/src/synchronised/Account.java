package synchronised;

public class Account
{
 int balance;
 public Account(int balance)
 {
	 this.balance=balance;
 }
 public void withdraw(int amount)
 {
	 balance= balance - amount;
	 System.out.println("After withdraw amount is ="+ amount);
	 System.out.println("After withdraw account balance is=" + balance);
	 
 }
 public void deposit(int amount)
 {
	 balance= balance + amount;
	 System.out.println("After deposit amount ="+ amount);
	 System.out.println("The balance is=" + balance);
	 
 }

}
