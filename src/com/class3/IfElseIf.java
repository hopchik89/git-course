package com.class3;

public class IfElseIf {
	//to autocomlete: ctrl+space+enter
	public static void main (String [] args) {
		//1. compare 2 numbers--> 3 possible conditions
		double num1=100.10;
		double num2=15.20;
		
		if (num1>num2) {
			System.out.println("Double value "+num1+" is larger than "+num2);
		}else if (num1<num2) {
			System.out.println("Double value "+num2+" is larger than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		//2. based on the day number define a day
		
		int day=6;
		if (day==1) {
			System.out.println("Today is Monday");
		}else if (day==2) {
			System.out.println("Today is Tuesday");
		}else if (day==3) {
			System.out.println("Today is Wedneseday");
		}else if (day==4) {
			System.out.println("Today is Thursday");
		}else if (day==5) {
			System.out.println("Today is Friday");
		}else if (day==6) {
			System.out.println("Today is Saturday");
		}else if (day==7) {
			System.out.println("Today is Sunday");
		}else {
			System.out.println("This date is invalid day");
		}
		//to format code: ctrl +shift+f--->windows users
		//to format code: cmd +shift+f--->mac users
	
	
	//HOME WORK
	
	int month=9;
	if (month==1) {
		System.out.println("Today is January");
	}else if (month==2) {
		System.out.println("Today is February");
	}else if (month==3) {
		System.out.println("Today is March");
	}else if (month==4) {
		System.out.println("Today is April");
	}else if (month==5) {
		System.out.println("Today is May");
	}else if (month==6) {
		System.out.println("Today is June");
	}else if (month==7) {
		System.out.println("Today is July");
	}else if (month==8) {
		System.out.println("Today is August");
	}else if (month==9) {
		System.out.println("Today is September");
	}else if (month==10) {
		System.out.println("Today is October");
	}else if (month==11) {
		System.out.println("Today is November");
	}else if (month==12) {
		System.out.println("Today is December");
	}else {
		System.out.println("This date is invalid month");
	}
	
	
	
	//HOME WORK
	//1.
    int temperature=-1;
	
	if(temperature>0) {
		System.out.println("The weather is positive");
	}else if(temperature<0) {
		System.out.println("The weather is negative");
	}else {
		System.out.println("The weather equals to 0");
	}
	//2.
	int numeral=99;
	if (numeral %2 ==0 ) {
		System.out.println( "Entered number is even");
	}else  {
		System.out.println("Entered number is odd");
	}
  }
}
