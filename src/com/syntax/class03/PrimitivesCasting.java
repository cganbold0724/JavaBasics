package com.syntax.class03;

public class PrimitivesCasting {
	
	public static void main(String[] args) {
		
		int i=100;
		double d=100;
		
		System.out.println(i); //100
		System.out.println(d); //100.0
		
		int x=(int)99.99;  //over write but loose value(narrowing)
		System.out.println(x);
		
		byte b=(byte)130;
		System.out.println(b);
		
		
		
	}
}
