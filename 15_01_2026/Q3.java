
/*4)	Bank Transaction Limit with Exception
Create a BankAccount class with the following:
Data members: accountNumber, accountHolderName, balance, dailyTransactionLimit.
Method: transfer(double amount)
Deducts amount from the balance.
If amount exceeds dailyTransactionLimit, throw a custom checked exception TransactionLimitExceededException.
Also, implement the custom exception class TransactionLimitExceededException with a descriptive message. 
Successful transfer within limit, Transfer exceeding the limit, which throws the exception
*/
import java.util.*;
class TransactionLimitExceededException extends RuntimeException{
	public String getError()
	{
		return "Please try after 24 hrs Your Daily Transition limit is over";
	}
}
class BankAccount{
	int acno;
	String  acHolderName;
	int bal;
	int dailyTraLimit=10000;
	public BankAccount(int acno, String acHolderName, int bal) {
		super();
		this.acno = acno;
		this.acHolderName = acHolderName;
		this.bal = bal;
	}
	public void transfer(int amt)
	{
		if(amt>dailyTraLimit)
		{
			TransactionLimitExceededException t=new TransactionLimitExceededException();
			 throw t;
		}
		else if(amt<dailyTraLimit)
		{
			if(amt>bal)
			{
				System.out.println("Balance is insufficient");
			}
			else {
				System.out.println("Amount Transfer Successfully");
				bal=bal-amt;
				dailyTraLimit=dailyTraLimit-amt;
			}
		}
		else {
			System.out.println("Some problem is here");
		}
	}
}
public class Q3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("Enter Account holder name");
			String acHoldName=sc.nextLine();
			System.out.println("Enter account no");
			int acNo=sc.nextInt();
			System.out.println("Enter total Balance");
			int bal=sc.nextInt();
			BankAccount b=new BankAccount(acNo,acHoldName,bal);
			int ch;
			do{
			System.out.println("Enter 1 for money Transfer ");
			System.out.println("Enter 2 for check daily Transition limit");
			System.out.println("enter 3 for exit");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter amount to transfer ");
				int amt=sc.nextInt();
				b.transfer(amt);
				break;
			case 2:
				System.out.println("daily transition limit remain ="+b.dailyTraLimit);
				break;
			case 3:
				System.exit(1);
			}
			}while(ch!=3);
		}
		catch(TransactionLimitExceededException t)
		{
			System.out.println(t.getError());

		}
	}
}
