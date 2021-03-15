package com.class6;

import java.util.Scanner;

public class Test2 {


		public static void main (String [] args) {
		    Scanner scan=new Scanner (System.in);
		    int age;
				String text;
				System.out.println("Please enter baby age");
				age=scan.nextInt();
				switch(age) {
				case 1:
					text="You can Crawl";
					break;
				case 2:
					text="You can Talk";
					break;
				case 3: 
					text="You can Dance";
					break;
				case 4:
					text="You can get  Trouble";
				    break;
				default:
					text="I don't know how old you are";
				}
					System.out.println(text);
		}
		
	}


