package com.class2;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		name="Chris";
		
		String greeting="Good Morning!";
		String phoneNumber="123-456-7890";
		
		String stringNumber="12";
		String space=" ";
		String letter="A";
		String letter2="A "; 
		char oneLetter='A';
		
		//Hello, my name is Chris
		System.out.println("Hello, my name is "+name);
		
		//How are you Chris?
		System.out.println("How are you "+name+"?");
		
		
		int age=25;
		//I am 25
		System.out.println("I am "+age);
		
		char grade='A';
		//Chris is A student
		System.out.println(name+" is "+grade+" student");
		
		/*
		 * String concatenation operator + can be used when 
		 * we attach String to another String
		 * we attach String to a number
		 * we attach String to any character or boolean
		 */
		
		String car="Tesla";
		int year=2021;
		//I drive 2021 Tesla
		System.out.println("I drive "+year+" "+car);
		
		String computer="Macbook";
		int memory=250;
		//Chris has Macbook with 250 GB memory
		System.out.println(name+" has "+computer+" with "+memory+" GB memory");
		
		String combinedValue=year+" "+car; //2021 Tesla
		System.out.println(combinedValue);
		
		int day=7; //or byte
		String month="February ";
		String date=month+day;
		System.out.println(date);
		
		//A)
		String fio="My name is Zhanna. ";
		String student="I am Syntax student. ";
		String city="I live in Astana, Kazakhstan. ";
		String phoneNum="And my phone number is ";
		int phone1=1231231234;
		String newCity="Washington";
		String newState="DC";
		String newPhone="3213213210";
		String allText=fio+student+city+phoneNum+phone1;
		System.out.println(allText);
		
		//B) 
		System.out.println(fio+" And I moved to new city "+newCity+" and new state "+newState+". My new phone number is "+newPhone);
		

		
		
		
		
		
		
	}

}
