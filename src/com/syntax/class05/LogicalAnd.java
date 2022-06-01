package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean job=false;
		double salary=75000;
		
		if(job&&salary>=100000) {
			System.out.println("I am super duper happy");
		}
		
		System.out.println("----------------------------");
		
		boolean study=true;
		boolean homework=false;
		boolean practice=true;
		
		if(study&&homework&&practice) {
			
			System.out.println("You will succeed in the course");
			
			
		}else {
			System.out.println("You will struggle");
		}
		

		System.out.println("----------------------------");
		
		int num1 = 200;
		int num2 = 200;
		int num3 = 23;
		
		int largest = 0;
		
		if (num1>num2 && num1>num3) {
			largest = num1;
		
		} else if (num3 > num1 && num3 > num2) {
			largest = num3;
		
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
			
		}else {
			System.out.println("All numbers are equal");
		}
		
		if(largest!=0) {
		System.out.println("The largest number is "+largest);
		}

	}

}
