import java.util.Scanner;

public class ATM {
	static Scanner in = new Scanner(System.in);;
	
	private BankAccount bankAccount;
	
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public static void main(String args[]) {
		ATM atm = new ATM(newAccount());
		
		atm.start();
	}
	
	public static BankAccount newAccount() {
		int ssn; String name; int phone; String address; double balance; int pin;
		
		System.out.println("SSN: ");
		ssn = in.nextInt();
		in.nextLine();
		System.out.println("Name: ");
		name = in.nextLine();
		System.out.println("Phone: ");
		phone = in.nextInt();
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
	
	private void start() {
		System.out.print(this.bankAccount.getAccountHolder().getName());
	}
}