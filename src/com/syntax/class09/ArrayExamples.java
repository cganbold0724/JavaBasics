package com.syntax.class09;

public class ArrayExamples {

	public static void main(String[] args) {
		
		//I want to store prices in array
		
		double[] price=new double[6];
		price[1]=1.99;
		price[2]=1.99;
		price[3]=1.99;
		System.out.println(price[0]);
		
		int [] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=10;
		numbers[2]=10;
		//numbers[3]=10; during run time error ->Arrayindexoutof bound
		
		System.out.println(numbers[3]);
		//arrays are fixed in size
		//during runtime JAVA cannot increase or decrease a size of an array

	}

}
