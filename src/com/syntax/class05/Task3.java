package com.syntax.class05;

import java.util.Scanner;

public class Task3 {
	
	/*
	 * Prompt the user to enter person heights in inches. Person should be classified as one of the following:
      short (under 60 inch)
      medium(between 60 -72 inch)
      tall (over 72 inch)
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your heights in inches");
		
		int height=input.nextInt();
		
		if (height<60) {
			System.out.println("You are too short");
		}else if (height>=60 && height<=72) {
			System.out.println("You average height");
			
		}else if (height>72) {
			System.out.println("You should be in NBA");
		}

	}

}
