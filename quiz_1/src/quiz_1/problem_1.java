package quiz_1;

import java.util.Scanner;

public class problem_1 {
	public static void main(String[] args) {
		System.out.println("Please enter the following stats of the player"
				+ "you wish to evaluate");
		Scanner input = new Scanner(System.in);
		System.out.print("Touchdown(TD)");
		double TD = input.nextDouble();

		Scanner input2 = new Scanner(System.in);
		System.out.print("Yards(YDS)");
		double Yards = input2.nextDouble();

		Scanner input3 = new Scanner(System.in);
		System.out.print("Interceptions(INT)");
		double INT = input3.nextDouble();

		Scanner input4 = new Scanner(System.in);
		System.out.print("Number of Completions(COMP) ");
		double comp = input4.nextDouble();

		Scanner input5 = new Scanner(System.in);
		System.out.print("Number of passes attempted(ATT)");
		double ATT = input5.nextDouble();
		
		double a =((comp/ATT)-0.3)*5;
		double b =((Yards/ATT)-3)*0.25;
		double c =(TD/ATT)*20;
		double d =2.375-(INT/ATT*25);
		
		double rating =((a+b+c+d)/6)*100;
		
		System.out.println("The QB rating of this player is ");
		System.out.printf("%3.1f",rating);

	}
}
