package Inter;

public class CurrentAccount implements InterfaceAccount

	{

			public void openaccount()
		{
			System.out.println("account is open");
		}
	    public void closeaccount()
	    {
	    	System.out.println("account is closed");
	    }
	    public void deposit(int amount)
	    {
	    	System.out.println(amount+"deposit");
	    }
	    public void withdraw(int amount)
	    {
	    	System.out.println(amount+"withdraw");
	    }
	}
	

