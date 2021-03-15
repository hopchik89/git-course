package com.class6;

import java.util.Scanner;

public class Test4 {

		 public static void main (String [] args) {
				String weekDay;
				Scanner scan=new Scanner(System.in);
			  System.out.println("Please enter any number from 1-7");
				int	day=scan.nextInt();	
					switch(day) {
					case 1:
						weekDay="Monday";
						break;
					case 2:
						weekDay="Tuesday";
						break;
					case 3: 
						weekDay="Wednesday";
						break;
					case 4:
						weekDay="Thursday";
					    break;
					case 5:
						weekDay="Friday";
						break;
					case 6:
						weekDay="Saturday";
						break;
					case 7:
						weekDay="Sunday";
						break;
					default:
						weekDay="Invalid";
					}
					if(!weekDay.equals("Invalid")) {
						System.out.println("Today is "+weekDay);
			  }
			  }
			
	}


