/*
 * Application.java

 * Lab01
 * 
 * @author Wesley Lui
 */

package com.wesley.calculator;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		if (args.length > 0) {
			// Process CLI arguments
		} else {
			// No CLI arguments, ask for user input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter operation (e.g., add, subtract, multiply, divide):");
			String operation = scanner.next();

			switch (operation.toLowerCase()) {
			case "add":
				System.out.println("Enter the first operand: ");
				double num1 = scanner.nextDouble();
				System.out.println("Enter the second operand: ");
				double num2 = scanner.nextDouble();
				System.out.println("Result: " + add(num1, num2));
				break;
			case "factorial":
				System.out.println("Enter a number: ");
				double number = scanner.nextDouble();
				System.out.println("Result: " + factorial(number));
				break;
			}
		}

	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static double factorial(double n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
