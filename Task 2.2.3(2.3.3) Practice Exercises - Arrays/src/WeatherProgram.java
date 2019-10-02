import java.util.Scanner;

public class WeatherProgram {
	private int monthDays;
	private double[] highTemp;
	private double[] lowTemp;
	private double avMax, avMin;
	private Scanner sc;

	public WeatherProgram() {
		scanStart();
		this.monthDays = getDays(this.monthDays);
		this.highTemp = new double[this.monthDays];
		this.lowTemp = new double[this.monthDays];
		getTemps();
		avMaxMin();
		highLowMin(this.lowTemp);
		highLowMax(this.highTemp);
		maxAboveAv(this.avMax, this.avMin);
	}

	public void scanStart() {
		this.sc = new Scanner(System.in);
	}

	public int getDays(int a) {
		System.out.print("Enter the number of days in the Month: ");
		a = this.sc.nextInt();
		this.sc.nextLine();
		while (a <= 0 || a > 31) {
			System.out.print("Error! Enter the number of days in the Month: ");
			a = this.sc.nextInt();
			this.sc.nextLine();
		}
		return a;
	}

	public void getTemps() {
		for (int a = 0; a < this.monthDays; a++) {
			System.out.print("Enter day " + (a + 1) + " min temp: ");
			this.lowTemp[a] = this.sc.nextDouble();
			this.sc.nextLine();
			System.out.print("Enter day " + (a + 1) + " max temp: ");
			this.highTemp[a] = this.sc.nextDouble();
			this.sc.hasNextLine();
		}
	}

	public void avMaxMin() {
		for (int i = 0; i < this.monthDays; i++) {
			this.avMax = this.avMax + (this.highTemp[i]);
			this.avMin = this.avMin + (this.lowTemp[i]);
		}
		System.out.print("\n");
		System.out.printf("The average max temp for the month is: %.1f", (this.avMax / this.monthDays));
		System.out.println();
		System.out.printf("The average min temp for the month is: %.1f", (this.avMin / this.monthDays));
		System.out.println("\n");
	}

	public void highLowMin(double[] low) {
		double lowLow = low[0];
		double highLow = low[0];
		for (int i = 0; i < this.monthDays; i++) {
			if (lowLow > low[i])
				lowLow = low[i];
			if (highLow < low[i])
				highLow = low[i];
		}
		System.out.println("-- For the month, the low Min and the low Max are --");
		System.out.printf("%-14s %-3s %-13s", "min Temp Min ", "||", "min Temp Max");
		System.out.println();
		System.out.printf("%-14.1f %-3s %-13.1f", lowLow, "||", highLow);
		System.out.println("\n");
	}

	public void highLowMax(double[] high) {
		double lowLow = high[0];
		double highLow = high[0];
		for (int i = 0; i < this.monthDays; i++) {
			if (lowLow > high[i])
				lowLow = high[i];
			if (highLow < high[i])
				highLow = high[i];
		}
		System.out.println("-- For the month, the high Min and the high Max are --");
		System.out.printf("%-14s %-3s %-13s", "high Temp Min ", "||", "high Temp Max");
		System.out.println();
		System.out.printf("%-14.1f %-3s %-13.1f", lowLow, "||", highLow);
		System.out.println();
	}

	public void maxAboveAv(double avMax, double avMin) {
		double monthAv = (((avMax / this.monthDays) + (avMin / this.monthDays)) / 2);
		int i = 0;
		int days = 0;
		while (i < this.monthDays) {
			if (this.highTemp[i] > monthAv) {
				days++;
			}
			i++;
		}
		System.out.println("\nNumber of days with max temp above the monthly average: " + days);
	}

	public static void main(String[] args) {
		WeatherProgram obj = new WeatherProgram();
	}

}
