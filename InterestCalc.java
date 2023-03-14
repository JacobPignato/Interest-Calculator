package Interestcalculator;

import java.util.Scanner;

public class InterestCalc {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("This program Calculates Interest\nPlease Enter the Principal of your interest. ");

		double principal = scan.nextDouble();

		System.out.println("wow, you're in some serious debt\nPlease enter the Rate of your interest. ");

		double rate = scan.nextDouble();

		System.out.println("Please Enter the number of years you will be paying this interest ");

		double time = scan.nextDouble();

		System.out.println(

				"is this program Simple interest or Compound interest\nPlease enter S for Simple interest or C for Compound interest. ");

		String interestType = scan.next();

		InterestCalc simpleInterest = new InterestCalc();

		if (interestType.equalsIgnoreCase("S") ) {

			System.out.println("You're calculated simple interest amount is "

					+ simpleInterest.calcInterest(principal, rate, time));

			simpleInterest.calcInterest(principal, rate, time);

		} else {

			System.out.println("Please Enter the number of times this interested is compounded per year ");

			double compound = scan.nextDouble();

			System.out.println("You're calculated compound interest amount is "

					+ compoundInterest(principal, rate, time, compound));

			compoundInterest(principal, rate, time, compound);

		}

		scan.close();

	}

	public double calcInterest(double principal, double rate, double time) {

		return principal * (rate / 100) * time;

	}

	public static double compoundInterest(double principal, double rate, double time, double compound) {

		return principal * (Math.pow((1 + (rate / 100) / compound), time * compound));

	}

}
