package com.class1;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		/*
		 * byte - datatype-what kind of values we are goig to store
		 * box1 - name of the variable--> label of the box
		 * 10 - value that we assign to that variable --> values that we put inside the box
		 */
		
		//we are storing whole number values
		byte box1=127; //-128 till 127
		short box2=32767; //-32768 to 32767
		int box3=100000; //-2147483648 to 2147483647
		long box4=100000000L; 
		
		//we are storing floating numbers
		float f=12.99f; //5-6 
	    double d=12.95; //bigger than 12
	    
	    //we are storing single character values
	    char a='$';
	    char b='A';
	    char c='1';

	   //to store boolean values
	   boolean variable1=true;
	   boolean variable2=false;
	  
	  //I would like to store value 99
	   int number=99;
	   
	   System.out.println(d); //12.95
	   System.out.println(a); //$
	   
	   //System.out.print(bool); Program gives error because variable bool is not created at the current moment
	   // boolean bool=true; program executes from TOP-->BOTTOM
	   
	   System.out.println(variable1); //true
	   System.out.println("variable1"); //variable1
	   
	   
	}

}
