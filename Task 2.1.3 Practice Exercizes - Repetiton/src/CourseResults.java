import java.util.Scanner;

public class CourseResults {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int count = 0;
		int min = 0;
		int max = 0;
		int av = 0;
		do {
			System.out.print("Enter final course results: ");
			a = sc.nextInt();
			// if first run set min to a to prevent zero always being the lowest number.
			if (count == 0)
				min = a;
			if (a != -1) {
				min = Math.min(a, min);
				max = Math.max(a, max);
				av = av + a;
				count++;
				sc.nextLine();
			}
		} while (a >= 0);
		System.out.println("Lowest result: " + min);
		System.out.println("Highest result: " + max);
		if (av != 0)
			System.out.println("Average result: " + (av / count));
		sc.close();
	}

}
