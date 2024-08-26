package com.sample;

public class FactorialCalculator {

public static int calculateFactorial(int a) {
	if (a < 0) {
		throw new IllegalArgumentException("Число должно быть положительным.");
	}
	int factorial = 1;
	for (int i = 1; i <= a; i++) {
		factorial *= i;
	}
	return factorial;
}
}