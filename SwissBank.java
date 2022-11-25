import java.util.*;

class SwissBank
{
	public SwissBank()
	{
		
	}
	public SwissBank(int accountNumber, String accountName,double accountBalance, int pin)
	{
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
		this.accountName=accountName;
		this.pin = pin;
	}
	int accountNumber;
	String accountName;
	double accountBalance;
	int pin;
}

class Transfer 
{
	public static void main(String args[])
	{
	SwissBank account1 = new SwissBank(112233,"Johnny",198799.00,1122);
	SwissBank account2 = new SwissBank(112244,"Sonny",10000.00,3344);
	
	System.out.println("Enter Amount to be transferred: ");
	Scanner in = new Scanner(System.in);
	int transferAmount = in.nextInt();
	if(transferAmount>account1.accountBalance)
	{
		System.out.println("Insufficient funds...");
		System.exit(0);
	}
	else
		System.out.println("Enter PIN");
		int enteredPin = in.nextInt();
		if(enteredPin==account1.pin)
		{
				account1.accountBalance-=transferAmount;
				System.out.println("Transferred successfully, new balance is"+account1.accountBalance);
				System.out.println("Amount credited from "+account1.accountName+" is "+transferAmount+" new balance is "+(account2.accountBalance+transferAmount));
		}
		else
			System.out.println("Invalid PIN");

}

}