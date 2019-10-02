import java.util.Scanner;

public class WeatherInOut {

	public static void main(String[] args) {
		String name, day, weather, time;
		double rain, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		name = sc.nextLine();
		System.out.println("Enter Day");
		day = sc.nextLine();
		System.out.println("Enter Time");
		time = sc.nextLine();
		System.out.println("Enter Temperature");
		temp = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Weather Conditions");
		weather = sc.nextLine();
		System.out.println("Enter Rainfall in mm");
		rain = sc.nextDouble();
		System.out.printf("%-10s %-13s %-10s %-10s %-10s %-10s \n", "Name-", "Day-", "Time-", "Temp(c)-", "Weather-",
				"Rain(mm)-");
		System.out.printf("%-10s %-13s %-10s %-10.1f %-10s %-10.1f \n", name, day, time, temp, weather, rain);
		sc.close();
	}
}
