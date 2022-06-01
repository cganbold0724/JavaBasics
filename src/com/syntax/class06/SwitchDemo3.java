package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Where are you from");
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "mexico":
			favoriteFood="tacos";
			break;
		case "mongolia":
			favoriteFood="horhog";
			break;
		case "canada":
			favoriteFood="poutine";
			break;
		case "turkey":
			favoriteFood="Lahmacun";
			break;
		default:
			favoriteFood="unknown";
		
		}
		
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);

	}

}
