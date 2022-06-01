package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		
		/*
		 * we are going to ask you if you got a job
		 * we will continuosly asking if you get a job until you say yes!
		 * once you say yes --> Congratulations!
		 */
		Scanner input = new Scanner(System.in);
		String job;
		do {
		System.out.println("Did you get a job?");
		job = input.next();
		
		} while (!job.equalsIgnoreCase("yes"));
		System.out.println("Congratulation");
		
		System.out.println("---------------------------");
		
		Scanner scan = new Scanner(System.in);
		String offer;
		
		System.out.println("Did you get a job");
		offer=scan.next();
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job");
			offer=scan.next();
			}
		System.out.println("Congratulations");
		

	}

}
