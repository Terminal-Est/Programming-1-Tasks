import java.util.Scanner;

public class TestAccounts {

	private static Accounts[] acc = new Accounts[10];
	private static int count = 3;

	public static void main(String[] args) {
		
		// Create accounts
		acc[0] = new Accounts("S5234", "David", 1000, 97627784, "NIL");
		acc[1] = new Accounts("S1239", "Cliff", 2000, 97293325, "NIL");
		acc[2] = new Accounts("S4236", "Martin", 3000, 97585245, "NIL");
		
		//Part C, uncomment code blocks to test each example
		//i
//		acc[1] = acc[0];
//		acc[2] = acc[1];
//		acc[0] = acc[2];
		
		//ii
//		acc[0] = acc[1];
//		acc[0].withdraw(100);
//		acc[1].withdraw(100);
		
		//iii.
		acc[0].transfer(acc[1], 500);
		acc[1].transfer(acc[2], 500);

		// iterate through and print details
		for (int i = 0; i < count; i++) {
			System.out.println(acc[i].getAccID() + " " + acc[i].getName() + " " + acc[i].getAmount());
		}

	}

}
