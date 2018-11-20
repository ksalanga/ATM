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
						"Kenneth Salanga",					// name is Kenneth Salanga
						"December 9, 2000",				// date of birth is December 9, 2000
						"123 street"		// address is 123 street
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
		}
		
		System.out.print("\nHi " + this.bankAccount.getAccountHolder().getName() + "! What can I help you with?");
		
		menu();
		in.close();
	}
	
	public void menu() {
		in = new Scanner(System.in);
		int menu = 0;
		
		System.out.print("\n\n   [1] Deposit\r\n" + 
				"   [2] Withdraw\r\n" + 
				"   [3] View Balance\r\n" + 
				"   [4] Exit\r\n" + 
				"\r\n" + 
				"Make a selection: ");
		
		while(menu == 0) {
			switch(in.nextInt()) {
			case 1:
				System.out.print("\nAlright, so we're depositing some money.\r\n" + 
						"\r\n" + 
						"Enter Amount: ");
				double deposit = in.nextDouble();
				
				if(this.bankAccount.deposit(deposit) == 0) {
					System.out.print("\nAmount must be greater than $0.00.");
				} else {
					System.out.print("\nDeposited $" + deposit + ". Updated balance is $" + this.bankAccount.getBalance());
				}
				
				menu();
			case 2:
				if (this.bankAccount.getBalance() == 0) {
					System.out.print("\nYou don't have any money to withdraw. Try depositing money first.");
				}
				else {
					System.out.print("\nAlright, so we're withdrawing some money.\r\n" + 
							"\r\n" + 
							"Enter Amount: ");
					
					double withdraw = in.nextDouble();
					
					if(this.bankAccount.withdraw(withdraw) == 0) {
						System.out.print("\nInsufficient funds.");
					} 
					else if(this.bankAccount.withdraw(withdraw) == 1) {
						System.out.print("\nAmount must be greater than $0.00.");
					} 
					else {
						System.out.print("\nWithdrew $" + withdraw + ". Updated balance is $" + this.bankAccount.getBalance());
					}
				}

				menu();
			case 3:
				System.out.print("\nCurrent balance is $" + this.bankAccount.getBalance() + ".");
				menu();
			case 4:
				System.out.print("\nGoodye!");
				break;
			default: 
				menu();
			}
		}
		in.close();
	}	
}