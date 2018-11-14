public class AccountHolder {
	private int SSN;
	private String Name;
	private double Phone;
	private String Address;
	
	public AccountHolder(int SSN, String Name, double Phone, String Address) {
		this.SSN = SSN;
		this.Name = Name;
		this.Phone = Phone;
		this.Address = Address;
		
	}
	public String getName() {
		return Name;
	}
	
	public int getSSN() {
		return SSN;
	}
	
	public double getPhone() {
		return Phone;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setPhone(int Phone) {
		this.Phone = Phone;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
}