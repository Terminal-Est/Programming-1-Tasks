import java.util.Scanner;

public class ClassBasics {

	public static void main(String[] args) {
		double amount = 0;
		Scanner sc = new Scanner(System.in);
		
		//Create accounts
		Account mum = new Account("s123", "Mercy Brown", 1000, 97627784, "NIL");
		Account dad = new Account("g234", "David Brown", 2000, 97293325, "NIL");
		mum.printAcc();
		dad.printAcc();
		
		//Take inputs for TFN
		System.out.print("Enter TFN for ACC s123: ");
		mum.setTfn(sc.nextLine());
		System.out.print("Enter TFN for ACC g234: ");
		dad.setTfn(sc.nextLine());
		System.out.println();
		
		//Deposit into account dad
		System.out.print("Enter amount to deposit into (dad): ");
		amount = sc.nextDouble();
		dad.deposit(amount);
		System.out.printf("%-20s%-15.2f\n", "Current balance (dad): ", dad.getAmount());
		System.out.println();
		
		//Withdraw from account mum
		System.out.print("Enter amount to withdraw from (mum): ");
		amount = sc.nextDouble();
		mum.withdraw(amount);
		System.out.printf("%20s%-15.2f\n", "Current balance (mum): ", mum.getAmount());
		System.out.println();
		
		//Transfer amount from object dad to object mum
		System.out.print("Enter amount to transfer from (dad) to (mum): ");
		amount = sc.nextDouble();
		dad.transfer(mum, amount);
		System.out.printf("%-20s%-15.2f\n", "Current balance (dad): ", dad.getAmount());
		System.out.printf("%20s%-15.2f\n", "Current balance (mum): ", mum.getAmount());
		System.out.println();
		
		//Add interest onto account
		System.out.print("Enter interest rate to calculate: ");
		amount = sc.nextDouble();
		mum.interest(amount); 
		dad.interest(amount);
		System.out.println();
		
		//Print final account details with TFN
		mum.printAcc();
		dad.printAcc();
		sc.close();
	}

}
