import java.util.Scanner;

public class GetName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nLen = 0;
		int gLen = 0;
		int index = 0;
		int lettersCorrect = 0;
		boolean win = false;
		String guess = "";
		String name = "";

		System.out.print("Player 1, Enter name: ");
		name = sc.next();
		nLen = name.length();

		while (index < 5 && win == false) {
			System.out.print("Player 2, Guess the name: ");
			guess = sc.next();
			gLen = guess.length();
			lettersCorrect = 0;
			if (guess.equalsIgnoreCase(name)) {
				win = true;
			} else {
				for (int a = 0; a < nLen; a++) {
					for (int b = 0; b < gLen; b++) {
						if (guess.charAt(b) == name.charAt(a))
							lettersCorrect++;
					}
				}
				System.out.println("You have guessed incorrectly, you got " + lettersCorrect + " out of "
						+ name.length() + " letters right.");
				System.out.println("You have " + (5 - (index + 1)) + " guesses left.");
			}
			index++;
		}
		if (win == true) {
			System.out.println("You have guessed correctly, you have won!");
		} else {
			System.out.println("You have lost, better luck next time.");
		}
		sc.close();
	}

}
