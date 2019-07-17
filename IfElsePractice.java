package co.grandcircus;

import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		System.out.println("This is Demo 2");

		Scanner scan = new Scanner(System.in);
		// Ask user for a number
		System.out.println("Please enter a grade: ");

		// Consume the number and assign it to a grade variable
		int grade = scan.nextInt();

		// Check to see if grade is in a certain range

		if (grade <= 100 && grade >= 0) {
			if (grade >= 85 && grade <= 100) {
				System.out.println("A");

			} else if (grade >= 71) {
				System.out.println("B");

			} else if (grade >= 61) {
				System.out.println("C");

			} else if (grade >= 51) {
				System.out.println("D");

			} else {
				System.out.println("F");

			}

		} else {
			System.out.println("Your grade is not between 0 and 100.");
		}
		// Print the grade out to console

		// This is where it ends
		scan.close();
	}

}
