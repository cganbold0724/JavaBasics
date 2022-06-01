package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<6; i++) {
			sum+=i;
		}
		System.out.println(sum);
		System.out.println("----------------");
		
		//write a program to find sum of all even and all odd numbers from 1 to 70
		
		int sum1=1;
		for(int i=1; i<=70; i+=2) {
			sum1+=i;
			System.out.print(i+" ");
		}
		System.out.println();
		int sum2=1;
		for(int i=0; i<=70; i+=2) {
			sum2+=i;
			System.out.print(i+" ");
		}
		
		
		}
		

	}

}
