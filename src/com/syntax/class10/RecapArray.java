package com.syntax.class10;

public class RecapArray {

	public static void main(String[] args) {

		String[] iceCream = new String[3];
		iceCream[0] = "butter pecan";
		iceCream[1] = "chocolate";
		System.out.println(iceCream[1]);

		System.out.println("----------------");

		String[] disney = { "Shrek", "Elsa", "Goofy", "Mulan", "Tom&Jerry" };
		System.out.println(disney[1]); // Elsa

		// to get all elements from an array

		for (int i = 0; i < disney.length; i++) {
			if(disney[i].equalsIgnoreCase("Shrek")) {
			System.out.println(disney[i] + " is my favorite character");
			}else {
			System.out.println(disney[i]);
			}
		}


	System.out.println("===========other way=============");


	for(

	String character:disney)
	{
		if (character.equalsIgnoreCase("Mulan")) {

			System.out.println(character + " is my favorite character");
		} else {
			System.out.println(character + " ");
		}
	}

}

}
