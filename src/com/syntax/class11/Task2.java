package com.syntax.class11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int arraySize = input.nextInt();
		String[] countryArray = new String[arraySize];
		
		for (int i = 0; i < countryArray.length; i++) {
			countryArray[i] = input.next();
		}
		for(String element:countryArray) {
			if(element.equalsIgnoreCase("usa")) {
				System.out.println("Washington DC");
			}else if(element.equalsIgnoreCase("Mongolia")) {
				System.out.println("Ulaanbatar");
			}else if(element.equalsIgnoreCase("Turkey")) {
				System.out.println("Anakara");
			}else {
				System.out.println("Country not supported by Java version 1.0");
			}
		}

	}

}
