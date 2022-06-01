package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("Enter operator");
		char operator = input.next().charAt(0);
		int result = 0;
		
		if (operator == '+') {
			System.out.println(num1+num2);
		}else if (operator =='-') {
			System.out.println(num1-num2);
		}else if (operator =='*') {
			System.out.println(num1*num2);
		}else if (operator == '/') {
			System.out.println(num1/num2);
		}else {
			System.out.println("Invalid");
		}
		
		System.out.println("------------------------------------");
		
		switch (operator) {
		case '+':
			result =(num1+num2);
			break;
		case '-':
			result =(num1-num2);
			break;
		case '*':
			result =(num1*num2);
			break;
		case '/':
			result =(num1/num2);
			break;
			default:
		}
		System.out.println(result);
		

	}

}
