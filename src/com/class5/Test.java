package com.class5;

import java.util.Scanner;

public class Test {

	public static void main (String [] args) {
		  Scanner scan=new Scanner (System.in);
		  String subject=null;
		  System.out.println("Is it weekend?");
		  boolean weekend=scan.nextBoolean();
		  if(weekend) {
		  subject="manual testing";
		  }else {
		  subject="Java";
		  }
		System.out.println("Today you will be learning "+subject);
		}
		       
		
		// TODO Auto-generated constructor stub
	}

