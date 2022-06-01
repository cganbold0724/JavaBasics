package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {

		int a = 100;
		while (a >= 1) {
			System.out.print(a + " ");
			a--;
		}
		// Print even number from 20-100
		System.out.println();

		int b = 20;
		while (b <= 100) {
			System.out.print(b + " ");
			b += 2;
		}

		// Print only odd numbers from 100 to 1
		System.out.println();
		int c = 99;
		while (c >= 1) {
			System.out.print(c + " ");
			c -= 2;
		}
		
		int d=100;
		System.out.println();
		while (d>=1) {
			if(d%2!=0) {
				System.out.print(d+" ");
			}
			d--;
		}

	}

}
