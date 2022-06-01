package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("We will issue a driver license to you");
		}else 
			System.out.println("We will offer you to get a learners permit");

		
	}
	

}

