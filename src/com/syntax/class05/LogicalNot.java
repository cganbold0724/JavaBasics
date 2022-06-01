package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*
		 * if there is no traffic - i will reach work on time
		 */
		
		boolean traffic = false;
		if(!traffic) {
			System.out.println("I will reach work on time");
		}
		
		String name="Enkhnaran";
		
		if (!name.equals("Chinzo")) {
			System.out.println("You are not Chinzo, and I need Chinzo");
		}

	}

}
