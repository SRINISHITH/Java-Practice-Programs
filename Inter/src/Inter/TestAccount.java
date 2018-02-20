package Inter;

public class TestAccount {
public static void main(String[] args) {
	InterfaceAccount DA= new DepositAccount();
	InterfaceAccount CA= new CurrentAccount();
	
	DA.openaccount();
	DA.closeaccount();
	DA.deposit(10000);
	DA.withdraw(2000);
	CA.openaccount();
	CA.closeaccount();
	CA.deposit(2000);
	CA.withdraw(200);
	
}
}
