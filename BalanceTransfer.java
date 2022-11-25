import java.util.*;

public class BalanceTransfer
{
		public static void main(String args[])
		{
			int existingBalance=2500;
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Swiss Bank!!");
			System.out.println("Enter Account Number:");
			int userEnteredAccount = sc.nextInt();
			int account = 562342; 
			if(userEnteredAccount==account)
			{
				System.out.println("Account found, please enter Withdraw amount: ");
				 int userWithdrawAmount=sc.nextInt();
				 if(userWithdrawAmount>existingBalance)
				 {
					 System.out.println("insufficient funds!!!, get out");
				 }
				 else
				 {
					 existingBalance=existingBalance-userWithdrawAmount;
					 System.out.println("Please wait dispachting amount");
					 System.out.println("Amount withdrawn is:"+userWithdrawAmount+" remaining balance is:"+existingBalance);
				 }
			}
			else
			{
				System.out.println("Account number doesn't match, get out!!");
			}
			
		}
}