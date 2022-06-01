package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the amount of loan is needed");
		int loan = input.nextInt();
		
		if (loan<=200000) {
			System.out.println("lend the money");
		}else {
			System.out.println("reject the client");
		}
		
		System.out.println("------------------------------------");
		
		
		
		
		
	}

}
