import java.util.Scanner;

public class ATM {
	private Scanner in;
	
	private BankAccount bankAccount;
	
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public static void main(String args[]) {
		ATM atm = new ATM(
				new BankAccount(						// create new BankAccount
					0,							// initial balance is 0
					new AccountHolder(						// create new User
						1234,						// PIN is 1234
						"Ryan Wilson",					// name is Ryan Wilson
						"January 1, 1970",				// date of birth is January 1, 1970
						"123 Main St., Scotch Plains, NJ 07076"		// address is 123 Main St., Scotch Plains, NJ 07076
					)
				)
			);

		atm.run();
	}
	
	public void run() {
		in = new Scanner(System.in);
		
		boolean secure = false;
		while(!secure) {
			System.out.print("Account # : ");
			long accountNumber = in.nextLong();
			System.out.print("    PIN # : ");
			int PIN = in.nextInt();
			if (this.bankAccount.getAccountNumber() == accountNumber && this.bankAccount.getAccountHolder().getPIN() == PIN) {
				secure = true;
			}
			else {
				System.out.println("Invalid account number and/or PIN.");
			}
		
		System.out.print("Hi " + this.bankAccount.getAccountHolder().getName() + "!");
		}
		
		
		
		
		
		
		//ask user for account #
		//Ask for pin
		//validate account/pin
		//if valid, show menu
		
		in.close();
	}
	
/**	
	OLD  CODE: public static BankAccount newAccount() {
		int ssn; String name; double phone; String address; double balance; int pin;
		
		System.out.println("NEW ACCOUNT");
		System.out.println("SSN: ");
		ssn = in.nextInt();
		in.nextLine();
		System.out.println("Name: ");
		name = in.nextLine();
		System.out.println("Phone: ");
		phone = in.nextDouble();
		in.nextLine();
		System.out.println("Address: ");
		address = in.nextLine();
		
		AccountHolder user = new AccountHolder(ssn, name, phone, address);
		
		System.out.println("Balance: ");
		balance = in.nextDouble();
		System.out.println("PIN: ");
		pin = in.nextInt();
	
		BankAccount account = new BankAccount(balance, pin, user);
		return account;
	}
**/
	
}