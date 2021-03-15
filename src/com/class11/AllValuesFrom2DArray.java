package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
				{"Alexandria","Oakton", "Arlington","Virginia Beach","Fairfax"},
				{"Philly","Strassburg","Pittsburgh"},
				{"Boston","Quincy","Springfield","Burlington"},
				{"Los Angeles","Long Beach","San Francisco","Sacramento","Santa Barbara"},
				{"Miami","Orlando","Tampa","Tallahasee"}
		};
		System.out.println(usa.length);//5 total single arrays inside usa
		System.out.println(usa[0].length);//how many elements inside first array
		System.out.println(usa[1].length);//how many elements inside second array
		System.out.println(usa[3].length);//how many elements inside third array
	
		for(int i=0; i<usa.length; i++) { // iterates over arrays
			for(int c=0; c<usa[i].length; c++) {
				System.out.println(usa[i][c]);
			}
			System.out.println();
			
		}
		System.out.println("--------- using nested for each loop----------------------");
		for(String[] cities:usa) {
			for(String city:cities) {
			System.out.println(city+" ");
		}
			System.out.println();
		}
	
	}

}
