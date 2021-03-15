package com.class12;

public class Dog {

		public String breed;
		public String size;
		public String color;
		public int age;

		public void bark () {
			System.out.println("ruff ruff and wow wow wow");
		}
		public void sleep() {
			System.out.println("ZZZZZzzzz...");
		}
		public void eat() {
			
			for(int i=0; i<5; i++) {
				System.out.println("Omnomnom...");
			}
		}
		public void look() {
			System.out.println("Hi I am a dog my color is "+color);
		}
	public static void main(String[] args) {

		Dog dog1= new Dog();
		dog1.breed="Bulldog";
		dog1.size="large";
		dog1.color="Light gray";
		dog1.age=5;
		dog1.bark();
		dog1.sleep();
		dog1.eat();
		dog1.look();
		
		
		Dog dog2= new Dog();
		dog2.breed="Beagle";
		dog2.size="large";
		dog2.color="Orange";
		dog2.age=6;
		
		Dog dog3= new Dog();
		dog3.breed="German Shepherd";
		dog3.size="large";
		dog3.color="Whote&orange";
		dog3.age=6;

}
}