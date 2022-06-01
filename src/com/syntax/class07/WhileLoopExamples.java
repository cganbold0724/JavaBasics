package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {

		// print numbers from 1 to 10;
		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}

		// print numbers from 10 to 1;
		System.out.println();
		int b = 10;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}

		// print numbers from 100 to 50;
		System.out.println();

		int c = 100;
		while (c >= 50) {
			System.out.print(c + " ");
			c--;
		}
		// print numbers from -1 to -10
		System.out.println();
		int d = -1;
		while (d >= -10) {
			System.out.print(d + " ");
			d--;
		}

		// print numbers from 1 to 20 but only even numbers
		System.out.println();

		int e = 2;
		while (e <= 20) {
			System.out.print(e + " ");
			e += 2;
		}
		System.out.println();

		int f = 1;
		while (f <= 20) {
			if (f % 2 == 0) {
				System.out.print(f + " ");
			}
			f++;
		}

	}

}
