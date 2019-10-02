import java.util.Scanner;

public class ClassBasics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account mum = new Account("s123", "Mercy Brown", 1000, 97627784, "NIL");
		Account dad = new Account("g234", "David Brown", 2000, 97293325, "NIL");
		mum.printAcc();
		dad.printAcc();
		System.out.print("Enter TFN for ACC s123: ");
		mum.setTfn(sc.nextLine());
		System.out.print("Enter TFN for ACC g234: ");
		dad.setTfn(sc.nextLine());
		System.out.println();
		mum.printAcc();
		dad.printAcc();
		System.out.println(mum.getName());
		sc.close();
	}

}
