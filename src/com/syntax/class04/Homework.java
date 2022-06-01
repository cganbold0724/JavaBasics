package com.syntax.class04;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter name");
		String name=scan.nextLine(); //capture String
		System.out.println(name);
		
		System.out.println("Please enter age");
		int age=scan.nextInt(); //capture int
		System.out.println(age);
		
		System.out.println("please enter price");
		double price=scan.nextDouble(); //capture double
		System.out.println(price);
	    
		System.out.println("Please enter boolean");
	    boolean boo=scan.nextBoolean(); //capture boolean
	    System.out.println(boo);
	    
	    System.out.println("Please enter any character");
	    char character=scan.next().charAt(0);
	    System.out.println(character);
		
		
			
		}

	}
