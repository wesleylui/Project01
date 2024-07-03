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
			// Further processing based on operation
		}
	}

	// TODO: Define methods for calculations
}
