package com.class13;

public class MoreMethodsExample {
/*
 * Create a method that does not take any values
 * and always return String Hi
 */
	
	String print() {
		return "Hi";
	}
	/*
	 * create a method that takes a number
	 * and returns the double of that number
	 */
	double doubleTheValue(double input) {
		return input*2;
	}
	/*
	 * Create a method that will take a boolean as input
	 * if the value is true I want to say "take the umbrella"
	 * and is the value is false I want to print "go for a walk"
	 */
	void isRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
	}
	
	/*
	 * write a method to print batch 9 is a great 5 times
	 */
	
	void batch() {
		for(int i=0; i<5; i++) {
		System.out.println("Batch 9 is a great");
		}
	}
	
	/*
	 * create a method that takes 2 numbers as input and
	 * return the greater number
	 */
	int greater(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	/*
	 * create a method that takes a number if number is even print
	 * number is even otherwise print number is odd
	 */
	void oddOrEven(double evenOrOdd) {
		if (evenOrOdd%2==0) {
			System.out.println(evenOrOdd+" is even");
		}else {
			System.out.println(evenOrOdd+" is odd");
		}
	}
	
	/*
	 * write a method that takes an array and returns the
	 * sum of the elements that are present in the array
	 */
	double theArraySum(double [] arr) {
		double sum=0;
		for(double element :arr) {
			sum=sum+element;
		}
		return sum;
	}
	/*write the method that returns true if a string is
	 * a mirror of itself otherwise it returns false
	 * aba yes
	 * bbb  yes
	 * bba no
	 */
	boolean isMirror(String str) {
	String newStr="";
	
	for(int i=str.length()-1; i>=0; i--) {
	System.out.println(i+" "+str.charAt(i));
	newStr+=str.charAt(i);
	}
	System.out.println(newStr);
	
	if(str.equals(newStr)) {
		return true;
	}else {
		return false;
	
}
}}