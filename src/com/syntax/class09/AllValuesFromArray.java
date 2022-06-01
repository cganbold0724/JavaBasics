package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		char[] grade1 = {'A','B','C','D'};
		
		for(int i=0; i<grade1.length; i++) {
			System.out.print(grade1[i]+" ");
		}
		System.out.println("");
		
		String[] words1 = {"Saturday", "is", "Java", "coding", "Day"};
		for(int a=0; a<words1.length; a++) {
			System.out.print(words1[a]+" ");
		}
		
		System.out.println();
		
		//Enhanced for loop/ advanced for loop/ for each loop CAN BE USED WHEN WE WORK WITH ARRAY or COLLECTIONS
		
		String[] colors = {"pink", "blue", "white", "black"};
		for(String color:colors) {
			System.out.print(color+" ");
		}
		
		System.out.println();
		
		int[] numers= {10,20,30,40};
		for(int num:numers) {
			System.out.print(num+" ");
		}
		
		

	}

}
