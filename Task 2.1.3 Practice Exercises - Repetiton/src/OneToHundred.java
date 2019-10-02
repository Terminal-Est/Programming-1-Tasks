
public class OneToHundred {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			// use modulo to check for a remainder. If remainder, print i.
			if (i % 3 != 0) { 
			System.out.print(i + " ");
			}
		}
	}

}
