package com.syntax.class09;

public class MoreNestedLoopsCLOCK {

	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				System.out.println(x+" x "+y+" = "+(x*y));
			}
		}
		
		System.out.println("--------------------------------------------------");
		
		for (int a=0; a<=2; a++) {
			for (int b=0; b<=9; b++) {
				if (a==2 && b==4) {
					break;
				}
				
				for(int c=0; c<=5; c++) {
					for(int d=0; d<=9; d++) {
						System.out.println(a+""+b+":"+c+d);
					}
				}
			}
		}
		
		System.out.println("---------------------------------------------");
		
		for (int hour=0; hour<=23; hour++) {
			for (int min=0; min<=5; min++)
				for (int min2=0; min2<=9; min2++)
					System.out.println(hour+":"+min+min2);
		}
		
			
		
		
		

	}

}
