package com.class2;

public class NamingConvention {

	public static void main(String[] args) {
		// keywords - a special word hat reserved in java memory; class, public, static, final..
		
		//identifiers - name that we give to classes, variable and methods
		
		/*
		 * RULE !!!
		 * DO NOT USE KEYWORD AS INDETIFIERS
		 * Identifiers CANNOT contain space
		 * Identifiers CANNOT start with numbers
		 * Identifiers CANNOT have special characters: _ or $
		 */

		//1. int final=10; Error: INVALID INDETIFIER
		//2. byte variable one=12;
		//3. short 1b=12;
		short b1=12;
		
		//4. long *l=2000;
		   //long l*=2000;
		
		long _l=2000;
		long long_=2000;
		
		double $price=12.99;
		double price$=10.00;
		
		
		//NamingConvention
		    //1. we use camel casing
			//2. classes starts with Upper cases and camel cases
			//3. variable start with lower case and will follow camel vases
			//4. packages we use lower case and use name as reverse way or url
			//5. use meaningful name for your variables
		
		
		int Number=12; //try not to use uppercase names
		int number=12; //more prefferable
		
		int numberONe=12;
		int numberTwo=13;
		
		boolean isSnow=true;
		boolean snow=true;
		
		double applePrice=12.99;
		double mangoPrice=13.99;
		
		
	}

}
