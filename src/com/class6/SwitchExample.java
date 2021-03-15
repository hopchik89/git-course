package com.class6;

public class SwitchExample {

	public static void main(String[] args) {
		/*
		 * store gender using M or F
		 * based on the gender we will specify
		 * 	if M --> Male
		 * 	if F --> Female
		 * 	otherwise --> not sure
		 */

		char gender='F';
		String description;
		switch(gender) {
		case 'M':
		    description="Male";
		    break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
		}
		System.out.println(description);
		
		
		/*
		 * LIMITATION:
		 * Switch CANNOT use Relational or Logical Operators (it simply chek value)
		 * Switch CANNOT be used with boolean, only BYTE, SHORT, CHAR, INT, STRING
		 */
		boolean sunny=true;
		if(sunny) {
			System.out.println("I am happy");
		}
		
		double price=10.99;
		if (price>10) {
			System.out.println("Too expensive");
		}
		
	}

}
