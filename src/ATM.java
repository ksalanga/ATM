import java.util.Scanner;

public class ATM {
	private Scanner in;
	
	private BankAccount bankAccount;
	
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public static void main(String args[]) {
		ATM atm = new ATM(new BankAccount(12, 12, new AccountHolder(12, "jeff", 908, "jf")));

		atm.run();
	}
	
	public void run() {
		in = new Scanner(System.in);
		System.out.print("Account # : ");
		System.out.print("    PIN # : ");
		//ask user for account #
		//Ask for pin
		//validate account/pin
		//if valid, show menu
		
		in.close();
	}
	
/**	
	public static BankAccount newAccount() {
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