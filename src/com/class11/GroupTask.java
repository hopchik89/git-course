package com.class11;

public class GroupTask {

	public static void main(String[] args) {
	/*
	 * Create a 2D array or integer type and store numbers
	 *  in 3 rows and 3 columns. Print the sum of all numbers.
	 */
		int [][]numbers= {
				{7, 8, 9},
				{1, 2, 3},
				{101, 108, 202}
		};
		int sum=0;
		
		for(int i=0; i<numbers.length; i++){
			for (int j=0; j<numbers[i].length; j++) {
				sum+=numbers[i][j];
			}
			
		}
		System.out.println("The sum of all numbers is equals to " +sum);

	/*
	 * Create a 2D array or integer type where you will store odd and even numbers
	 *  in 3 rows and 4 columns. 
	 *  Develop a program which will identify/print the even numbers only.
	 */
		int [] [] numbers1= {
				{5,6,7,8},
				{23,45,66,84},
				{102,345,543,678}
		};
		
		for ( int r=0; r<numbers1.length; r++) {
			
			for (int c=0; c<numbers1[r].length; c++) {
				
				if ( numbers1[r] [c]%2==0 ) {
					System.out.print(numbers1 [r][c]+" ");
					
				}
				
			}
			System.out.println();
		}
		System.out.println("-------------------");
	
		
		/*
		 * 3. Create a 2D array or integer type where you will store integer 
		 * values in 3 rows and 4 columns. 
		 * Develop a program which will calculate the sum of 
		 *  even and odd numbers for that array.
		 */
	
		int[][] numbers2 = { { 12, 15, 19, 90 }, { 19, 23, 5, 4 }, { 55, 91, 73, 64 } };
		int sum2 = 0;
		int odd = 0;
		for (int r = 0; r < numbers2.length; r++) {
			for (int a = 0; a < numbers2[r].length; a++) {
				if (numbers2[r][a] % 2 == 0) {
					sum2 += numbers2[r][a];
				} else {
					odd += numbers2[r][a];
				}
			}
		}
		System.out.println("The sum of even numbers are "+ sum2);
		System.out.println("the sum of odd numbers are "+ odd);
	}

}
