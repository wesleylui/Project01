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

	public static double factorial(double n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
