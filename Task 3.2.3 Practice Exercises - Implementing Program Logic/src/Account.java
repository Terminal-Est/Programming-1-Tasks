
public class Account {

	private String accID;
	private String name;
	private double balance;
	private int phone;
	private String tfn;

	public Account(String accID, String name, double amount, int phone, String tfn) {
		this.accID = accID;
		this.name = name;
		this.balance = amount;
		this.phone = phone;
		this.tfn = tfn;
	}

	// getters below if you wish to return individual values.
	public String getAccID() {
		return this.accID;
	}

	public String getName() {
		return this.name;
	}

	public double getAmount() {
		return this.balance;
	}

	public int getPhone() {
		return this.phone;
	}

	public String getTfn() {
		return this.tfn;
	}

	// set TFN
	public String setTfn(String tfn) {
		this.tfn = tfn;
		return tfn;
	}

	// Deposit amount into balance
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	// Withdraw amount out of balance
	public boolean withdraw(double amount) {
		boolean result = false;
		if (this.balance > amount) {
			result = true;
			this.balance -= amount;
		}
		if (!result)
			System.out.print("Amount over limit!");
		return result;
	}

	public double interest(double rate) {
		this.balance = this.balance + (this.balance * (rate / 100));
		return rate;
	}

	// Transfer amount to acc
	public boolean transfer(Account acc, double amount) {
		boolean result = false;
		if (this.balance > amount) {
			result = true;
			acc.deposit(amount);
			this.balance -= amount;
		}
		if (!result)
			System.out.print("Amount over limit!");
		return result;
	}

	// print helper
	public void printAcc() {
		System.out.printf("%-20s%-15s\n", "Account ID:", this.accID);
		System.out.printf("%-20s%-15s\n", "Account Name:", this.name);
		System.out.printf("%-20s%-15s\n", "Account Balance:", "$" + this.balance);
		System.out.printf("%-20s%-15s\n", "Account Phone No.:", this.phone);
		System.out.printf("%-20s%-15s\n", "Account TFN:", this.tfn);
		System.out.println();
	}

}
