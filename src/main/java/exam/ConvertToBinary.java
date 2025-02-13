package com.javamultiplex.baseconversion;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter decimal number : ");
			String number = input.next();

			if (isDecimalNumber(number)) {
				String binary = getBinaryNumber(number);
				System.out.println("Binary number : " + binary);
			} else {
				System.out.println("Please enter valid decimal number.");
			}
		} finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static String getBinaryNumber(String number) {

		// Converting String to Integer.
		int decimal = Integer.parseInt(number);
		int remainder = 0;
		StringBuilder binary = new StringBuilder();
		while (decimal != 0) {
			remainder = decimal % 2;
			// Converting Integer to String and adding into StringBuilder.
			binary.append(String.valueOf(remainder));
			decimal = decimal / 2;
		}

		// Reverse String using library function of StringBuilder class.
		return binary.reverse().toString();
	}

	private static boolean isDecimalNumber(String number) {

		// Regular expression that matches String containing only digits [0-9].
		String pattern = "^[0-9]+$";
		boolean result = false;
		if (number.matches(pattern)) {
			result = true;
		}
		return result;
	}

}
