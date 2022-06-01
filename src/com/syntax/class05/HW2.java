package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input city");
		String city = input.nextLine();
		
		System.out.println("input temperature");
		int temp = input.nextInt();
		
		System.out.println("The temperature is the city "+city+" is "+(temp-32)*5/9);
		
		

	}

}
