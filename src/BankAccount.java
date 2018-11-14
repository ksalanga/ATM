public class BankAccount {
	private double Balance;
	private int PIN;
	private AccountHolder AccountHolder;
	
	public BankAccount(double Balance, int PIN, AccountHolder AccountHolder) {
		this.Balance = Balance;
		this.PIN = PIN;
		this.AccountHolder = AccountHolder;
	}
	
	public double getBalance() {
		return Balance;
	}
	
	public int getPIN() {
		return PIN;
	}
	
	public AccountHolder getAccountHolder() {
		return AccountHolder;
	}
	
	public void setPIN(int PIN) {
		this.PIN = PIN;
	}
}