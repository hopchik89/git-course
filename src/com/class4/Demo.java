package com.class4;

import java.util.Scanner;
//shortcut to import: mac cmd+shift+o; windows ctrl+shift+o;
public class Demo {

	public static void main(String[] args) {
		
		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any text");
				//captures entire text with spaces
		String text=scan.nextLine(); //scan.nextLine(); --> capture your input from console
									//once you enter text you must HIT ENTER
		
		System.out.println("Text that I entered is "+text);
		
		System.out.println("Please enter your name ");
		
		String name=scan.next(); //captures I word till space
		
		System.out.println("Nice to meet you "+name);
		
		System.out.println("Please enter your age ");
		int age=scan.nextInt();
		System.out.println("My name is "+name+" and I am "+age+" years old");

	}

}
