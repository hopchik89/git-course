package com.class11;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array where you will store the following values:
		 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		 *  After storing values print the following:
		 *  Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		String[][] names= {
				{"Mr ","Mrs ","Ms ","Miss "},
				{"Smith","Jordan","Jackson","Obama"}
				};
System.out.println(names[0][1]+names[1][0]); 
System.out.println(names[0][0]+names[1][3]); 
System.out.println(names[0][2]+names[1][2]); 
System.out.println(names[0][3]+names[1][1]); 

/*
 * Create a 2D array that first row will contain 4 names
 *  and second row will contain grades. 
 *  Then your program should print name of the students
 *   that has A and B grade
 */
		String[][] names1= {
		{"Zhanna ","Aisha ","Yuliya ","Daryna "},
		{"A","B","A","B"}
		};
		System.out.println(names1[0][0]+" has grade "+names1[1][0]+" and "+names1[0][1]+" has grade "+names1[1][1]);
	}

}
