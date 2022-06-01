package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {

		// Create an array to store char values and then print those in reverse order

		char[] values = { 'A', 'B', 'C', 'D', 'E' };
		for (int i =values.length-1; i >= 0; i--) {
			System.out.print(values[i] + " ");
		}

	}

}
