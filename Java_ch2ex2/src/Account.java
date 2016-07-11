/* Create a class called ?Account?.

   The Account class is meant to hold the account details including account
   holders name, account number and balance with methods for withdrawing and
   depositing money.

   Create two more classes representing an Investment Account and a Savings
   Account. These classes should derive from the base class Account. */

/** @author KAILASH JOSHI*/

public class Account {
	String accHolderName = "";
	String accNumber = "";
	long accBalance = 100000;

	public static void main(String[] args) {
		InvestAcc investAcc = new InvestAcc();
		investAcc.depositMoney(50000L);
		investAcc.withdrawMoney(25000L);

		System.out.println("This is InvestAcc class which is inherited from Account class. And the current balance is : "
						+ investAcc.getinvestAccBalance());
		
		SavingAcc savingAcc = new SavingAcc();
		savingAcc.depositMoney(25000L);
		savingAcc.withdrawMoney(10000l);

		System.out.println("This is SavingAcc class which is inherited from Account class.And the current balance is : "
						+ savingAcc.getsavingAccBalance());
	}

	public void withdrawMoney(long withdrawAmount) {
		accBalance = accBalance - withdrawAmount;

	}

	public void depositMoney(long depositAmount) {
		accBalance = accBalance + depositAmount;
	}

}

class InvestAcc extends Account {
	public long getinvestAccBalance() {
		return accBalance;
	}
	
}

class SavingAcc extends Account {
	public long getsavingAccBalance() {
		return accBalance;
	}
}

/*
 * After completing the exercise, you can submit it using the button provided on
 * the application. You should find a button near the bottom right corner of
 * your screen.
 */