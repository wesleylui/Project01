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
			System.out.println("Enter operation (e.g., add, subtract, multiply, divide, factorial):");
			String operation = scanner.next();

			switch (operation.toLowerCase()) {
			case "add":
				System.out.println("Enter the first operand: ");
				double num1 = scanner.nextDouble();
				System.out.println("Enter the second operand: ");
				double num2 = scanner.nextDouble();
				System.out.println("Result: " + add(num1, num2));
				break;
			case "subtract":
				System.out.println("Enter the first operand: ");
				double num3 = scanner.nextDouble();
				System.out.println("Enter the second operand: ");
				double num4 = scanner.nextDouble();
				System.out.println("Result: " + subtract(num3, num4));
				break;
			case "multiply":
				System.out.println("Enter the first operand: ");
				double num5 = scanner.nextDouble();
				System.out.println("Enter the second operand: ");
				double num6 = scanner.nextDouble();
				System.out.println("Result: " + multiply(num5, num6));
				break;
			case "divide":
				System.out.println("Enter the first operand: ");
				double num7 = scanner.nextDouble();
				System.out.println("Enter the second operand: ");
				double num8 = scanner.nextDouble();
				System.out.println("Result: " + divide(num7, num8));
				break;
			case "factorial":
				System.out.println("Enter a number: ");
				double number = scanner.nextDouble();
				System.out.println("Result: " + factorial(number));
				break;

			case "factorial bar":
				System.out.println("Enter a number: ");
				long number1 = scanner.nextLong();
				System.out.println(factorialAlt(number1));
			}
		}

	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static double subtract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		if (b == 0) {
			System.out.println("Error: Cannot divide by zero.");
			return 0;
		} else {
			return a / b;
		}
	}

	// Exponentiation
	public static double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	// Square root
	public static double sqrt(double num) {
		return Math.sqrt(num);
	}

	// Natural logarithm
	public static double log(double num) {
		return Math.log(num);
	}

	// Base-10 logarithm
	public static double log10(double num) {
		return Math.log10(num);
	}

	// Sine function
	public static double sin(double angleRadians) {
		return Math.sin(angleRadians);
		//trig funcs expect args in radians. convert back to degrees when printing result?
	}

	// Cosine function
	public static double cos(double angleRadians) {
		return Math.cos(angleRadians);
	}

	// Tangent function
	public static double tan(double angleRadians) {
		return Math.tan(angleRadians);
	}

	// factorial using recursion
	public static double factorial(double n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	// factorial using loop, helper function, and progress bar
	public static long factorialAlt(int num) {
		if (num < 0) {
			System.out.println("Factorial of negative number is undefined.");
			return 0;
		}
		return factorialHelper(num, num);
	}

	// helper function for factorialAlt
	private static long factorialHelper(int originalNum, int num) {
		if (num <= 1) {
			return 1;
		}
		// Calculate progress and update progress bar
		int progress = (int) (((originalNum - num) / (double) originalNum) * 100);
		System.out.println("\rCalculating factorial: " + progress + "%");
		return num * factorialHelper(originalNum, num - 1);
	}
}
