package com.bridgelabz.dsalgoprograms;

import java.util.Scanner;

public class PrimeNumbersFromRange {

	public boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to print prime numbers: ");
		int input = sc.nextInt();
		PrimeNumbersFromRange primeNumbers = new PrimeNumbersFromRange();

		System.out.println("Prime numbers upto " + input + " is: ");
		for (int i = 0; i <= input; i++) {
			if (primeNumbers.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
