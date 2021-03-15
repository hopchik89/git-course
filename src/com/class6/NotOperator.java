package com.class6;

public class NotOperator {

	public static void main(String[] args) {


		boolean rain=true;
		
		if(!rain) { //not rain
			System.out.println("I will go to the park");
		}

		boolean boo=true;
		System.out.println(boo); //false
		
		boolean boo1=!false;
		System.out.println(boo1); //true
		
		
		boolean traffic=false;
		if(!traffic) { //false
			System.out.println("I will come on time");
		}
		
		String day="Saturday";
		if(!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		//NOT operator ! --> always placed before the condition
		
		boolean homeWork=false;
		if(!homeWork) {
			System.out.println("I will be happy");
		}
		
	}

}
