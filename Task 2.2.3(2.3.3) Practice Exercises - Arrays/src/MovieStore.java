import java.util.Scanner;

public class MovieStore {

	public static void main(String[] args) {
		String movies[] = new String[10];
		String search = "";
		String searchRes = "Search results:";
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int currSize = 0;
		System.out.println("Welcome to the movie store!");
		while (currSize < movies.length && exit == false) {
			System.out.print("Enter movie " + (currSize + 1) + (": "));
			movies[currSize] = sc.nextLine();
			if (movies[currSize].isEmpty()) {
				exit = true;
			} else {
				currSize++;
			}
		}
		System.out.println("Search for title: ");
		search = sc.nextLine();
		for (int j = 0; j < currSize; j++) {
			if (movies[j].contains(search))
				searchRes = searchRes + ("\n\tResult ") + (j + 1) + " - " + movies[j];
		}
		System.out.println(searchRes);
		sc.close();
	}

}
