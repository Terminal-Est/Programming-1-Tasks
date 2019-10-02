import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		int student1, student2, student3, high, highFinal, low, lowFinal;
		double av;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student 1 mark:");
		student1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student 2 mark:");
		student2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student 3 mark:");
		student3 = sc.nextInt();
		sc.nextLine();
		sc.close();
		// remember to cast to double to get the decimal point value.
		av = ((double)student1 + (double)student2 + (double)student3) / 3;
		System.out.printf("%s %.2f", "The average student mark obtained was:", av);
		high = Math.max(student1, student2);
		highFinal = Math.max(high, student3);
		low = Math.min(student1, student2);
		lowFinal = Math.min(low, student3);
		System.out.println("\nThe maximum student mark obtained was: " + highFinal);
		System.out.println("The minimum student mark obtained was: " + lowFinal);
	}

}
