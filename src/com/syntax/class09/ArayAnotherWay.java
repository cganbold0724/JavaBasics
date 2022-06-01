package com.syntax.class09;

public class ArayAnotherWay {

	public static void main(String[] args) {
		
		String[] fruits= {"mango", "apple", "kiwi", "pear", "watermelon", "melon"};
		System.out.println(fruits[2]);
		//fruits[4]="peach"; re:ArrayIndexOutOfBoundsException:4
		
		System.out.println("My favorite fruit is "+fruits[0]);
		
		//want to find a size of an array/how many elements?
		int size=fruits.length;
		System.out.println(size);
		

	}

}
