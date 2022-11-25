import java.util.*;
import java.lang.*;

class UpiTransfer
{
	public static void main(String[] args)
	{
		int existingBalance = 1000000;
		Map<Integer, String> users = new HashMap<Integer,String>();
		users.put(99223344,"Jhonny");
		users.put(99887766,"Bhonny");
		users.put(99887755,"Ghonny");
		users.put(99886644,"Shonny");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Phone Number");
		int userPhoneNumber = input.nextInt();
		boolean found = users.containsKey(userPhoneNumber);
		if(found==false)
		{
			System.out.println("Please enter correct Phone number");
		}
		else
		{
			System.out.println("User name is:"+users.get(userPhoneNumber));
			System.out.println("Enter amount that you want transfer:");
			int transferAmount = input.nextInt();
			if(transferAmount>existingBalance)
			{
				System.out.println("Insufficient Funds!");
			}
			else{
				existingBalance-=transferAmount;
				System.out.println("Transfer Successfull! Amount available is"+existingBalance);

			}
		}
	}
}