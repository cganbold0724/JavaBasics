package com.syntax.class10;

public class MoreExamples2DArray {

	public static void main(String[] args) {

		int[][] nums = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 199, 300, 588, 700 }, 
				{ 1900, 4578, 98787 } };
		/*
		 * i loop iterates over rows nums.length gives # of arrays inside 2D array =3 j
		 * loop iterates over columns
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * enhanced for loop uses variables to access elements from an array
		 * outer for loops-> iterates over 1d array
		 * inner loop -> iterates over elements of each 1d array
		 */
		
		for(int[]num:nums) {
			for(int n:num) {
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
