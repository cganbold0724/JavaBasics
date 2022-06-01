package com.syntax.class03;

public class IfStatement {
	
	public static void main(String[] args) {
		
		double mortgageRate=4.5;
		
		if (mortgageRate>5) {
			System.out.println("I am not buying a house");
		}
		
		int num1=99;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
		
		int temp=68;
		
		if (temp>75) {
			
			System.out.println("I will go for a walk");
		}else {
			System.out.println("I am going to study Java");
		}
		
		System.out.println("-----------------------------------------");
		
		char gender='f';
		
		if (gender=='f') {
			System.out.println("You like shopping");
		}else {
			
		  System.out.println("You like watching sports");
		}
		

		System.out.println("-----------------------------------------");
		
		String browser="Chrome";
		
		if (browser.equals("chrome")) {
			
			System.out.println("All test cases will be executed on chrome");
		}else {
			System.out.println("I am not executing any test cases");
			System.out.println("Reason - wrong browser");
		}
	}

}
