import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		String lightColor = "";
		String safe = "";
		Scanner sc = new Scanner(System.in);
		while (!lightColor.equalsIgnoreCase("e")) {
			System.out.println("--Enter light color. Type e to exit.--");
			lightColor = sc.next();
			if (lightColor.equalsIgnoreCase("green")) {
				System.out.println("--Green, is the intersection blocked? Y/N--");
				safe = sc.next();
				if (safe.equalsIgnoreCase("n")) {
					System.out.println(
							"You are allowed to go through the interstection if there is room for your vehicle on the other side.");
				} else if (safe.equalsIgnoreCase("y")) {
					System.out.println("Do not proceed through the intersection");
				} else {
					System.out.println("Invalid selection.");
				}
			} else if (lightColor.equalsIgnoreCase("yellow")) {
				System.out.println("--Yellow, is it safe to stop? Y/N--");
				safe = sc.next();
				if (safe.equalsIgnoreCase("n")) {
					System.out.println("Proceed through the intersection.");
				} else if (safe.equalsIgnoreCase("y")) {
					System.out.println("Do not proceed through the intersection.");
				} else {
					System.out.println("Invalid selection.");
				}
			} else if (lightColor.equalsIgnoreCase("red")) {
				System.out.println("Red, you must stop and don't go into the intersection.");
			} else {
				System.out.println("Invalid light color.");
			}
		}
		sc.close();
	}

}
