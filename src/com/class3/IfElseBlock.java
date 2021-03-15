package com.class3;

public class IfElseBlock {

	public static void main(String[] args) {


		double expectedHours=15;
		double actualHours=24;
		
		if (actualHours>expectedHours) {
			System.out.println("You will succeed");
		}else {
			System.out.println("You will have a hard time. Please study more!");
		}
		
		//TASK1
		double a=10;
		double b=15;
		if (a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("b is larger than a");
		}
		
		//TASK2
		System.out.println("Start of Temperature Check");
		int temp1=34;
		if (temp1<32) {
			System.out.println("Water will freeze with temperature "+temp1);
			System.out.println("It is very cold!");
		}else {
			System.out.println("Water will NOT freeze with temperature "+temp1);
			
		}
		System.out.println("End of program");
		
		
		double money=5;
		double $coke=3;
		
		if(money==$coke) {
			System.out.println("I am buying soda");
		}else {
			System.out.println("I need exact amount");
		}
		
		
		boolean snow=true;
		if(snow==true) {
			System.out.println("YAY, I will play with the snow");
		}else {
			System.out.println("I am going to rie my bicycle");
		}
		
		boolean snow1=false;
		if(snow1) {
			System.out.println("YAY, I will play with the snow");
		}else {
			System.out.println("I am going to rie my bicycle");
		}
		
		
		boolean summer=false;
		if(summer) {
			System.out.println("I am going to Florida");
		}else {
			System.out.println("I will stay at home");
		}
	}

}
