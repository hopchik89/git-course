package com.class2;

public class ArithmeticOperatos {

	public static void main(String[] args) {


		int num1=10;
		int num2=5;	
		// +,*,/,%,-
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//sum of number 10 and 5 is =15
		System.out.println("Sum of number "+num1+" and "+num2+" is ="+sum);
		System.out.println("Sum of number "+num1+" and "+num2+" is =15");
		
		double number1=10.99;
		double number2=90.99;
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number1/number2;
		
		System.out.println("Result of division of 2 double values "+divOfDouble);
		
		float n1=10.99f;
		float n2=90.99f;
		float divOfFloat=n2/n1;
		
		System.out.println("Result of divisions of 2 float values "+divOfFloat);
		
//HOme work
		//1.
		double first=100;
		double second=1000;
		double subOf12=first-second;
		double multOf12=first*second;
		double divOf12=first/second;
		double sumOf12=first+second;
		System.out.println("The subtract of 2 numbers "+first+" and "+second+" is equal to "+subOf12);
		System.out.println("The multiply of 2 numbers "+first+" and "+second+" is equal to "+multOf12);
		System.out.println("The divide of 2 numbers "+first+" and "+second+" is equal to "+divOf12);
		System.out.println("The add of 2 numbers "+first+" and "+second+" is equal to "+sumOf12);
		
		//2.
		float a1=3.9f;
		float a2=3.9f;
		float square=a1*a2;		
		System.out.println("The square of the "+a1+" is "+square);
		
		//3.
		int width=5;
		int height=8;
		int perimetr=width+height+width+height;
		int square1=width*height;
		System.out.println("The perimetr of a rectangle with width "+width+" and height "+height+" is equal to "+perimetr+" and the area is "+square1);
		
		
		//precedence *& / then +&-
		int result=(10+2)*5;
		System.out.println(result);
		
		//modulus operator --> shows reminder of the divisions
		int mod=10%3;
		System.out.println("Remainder is = "+mod); //1
		
		int mod1=10%2;
		System.out.println("Remainder is = "+mod1); //0
		
		int mod2=15%4; //4*#=12; 15-122=3
		System.out.println("Remainder is = "+mod2); //3
		
		int r=(20%7)*3;
		System.out.println(r);
		
		
		
		
		
		
		
	}

}
