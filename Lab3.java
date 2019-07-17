package co.grandcircus;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first name");

		String name = scan.next();

		String run = "Y";
		while (run.equals("Y")) {

			System.out.println("Enter a number between 1 and 100 and make sure it's not negative");

			int input = scan.nextInt();

			int answer = input % 2;

			if (answer == 0 && input <= 25) {
				System.out.println(name + " The number is Even and less than 25");
			} else if (answer == 0 && input > 25) {
				System.out.println(name + " The number is Even");
			} else if (answer == 0 && input > 60) {
				System.out.println(name + " The number " + input + " is Even");
			} else if (answer != 0 && input > 60) {
				System.out.println(name + " The number " + input + " is Odd and over 60");
			} else if (answer != 0) {
				System.out.println(name + " The number " + input + " is Odd");
			} else {
				System.out.println(
						name + " Your response was unrecognizable, please choose a positive number between 1 and 100");
			}

			System.out.println("Would you like to keep going, Type Y or N");

			run = scan.next();


		}

		scan.close();
		// if (run.equals("N")) {
		System.out.println("Have a nice rest of the Day, Thanks for participating");
	}

}
