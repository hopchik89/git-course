package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning=false;
		boolean classToday=true;
		//is it morning? -->Good morning
			// if there is class: yes--> hello classmates
			//          	otherwise--> hello my family
		
		if (morning) {
			System.out.println("Let me check if I have class today");
			if(classToday) {
				System.out.println("Good morning my classmates");
			}else {
				System.out.println("Good morning my family");
			}
		
		}
		
		
		System.out.println("End of code");
		
		System.out.println("------Example 2----------");
		
		boolean anyAllergy=true;
		boolean pollenAllergy=true;
		
		if(anyAllergy) {
			System.out.println("Lets check wich allergies you have ");
			if(pollenAllergy) {
				System.out.println("Do not get close to trees");
			}else {
				System.out.println("Ok I know you dont have pollen allergy");
			}
		}else {
			System.out.println("You are lucky not having any allergies");
		}
		


	}

}
