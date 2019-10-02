
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

	public String setTfn(String tfn) {
		this.tfn = tfn;
		return tfn;
	}

	public void printAcc() {
		System.out.printf("%-20s%-15s\n", "Account ID:", this.accID);
		System.out.printf("%-20s%-15s\n", "Account Name:", this.name);
		System.out.printf("%-20s%-15s\n", "Account Balance:", "$" + this.balance);
		System.out.printf("%-20s%-15s\n", "Account Phone No.:", this.phone);
		System.out.printf("%-20s%-15s\n", "Account TFN:", this.tfn);
		System.out.println();
	}

}
