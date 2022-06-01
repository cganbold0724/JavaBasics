package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		
		char[] grade = new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		
		char[] grade1 = {'A','B','C','D','E','F'};
		System.out.println(grade1[1]);
		
		String[] words = new String[5];
		words[0]="Saturday";
		words[1]="is";
		words[2]="Java";
		words[3]="coding";
		words[4]="Day";
		System.out.println(words[0]+" "+words[1]+" "+words[2]+" "+words[3]+" "+words[4]);
		
		String[] words1 = {"Saturday", "is", "Java", "coding", "Day"};
		System.out.println(words1[0]+" "+words1[1]+" "+words1[2]+" "+words1[3]+" "+words1[4]);

	}

}
