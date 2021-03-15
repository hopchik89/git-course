package com.class9;

public class Recap {

	public static void main(String[] args) {
		for(int i=1; i<3; i++) {
			
			for(int j=1; j<=4; j++) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println("------------print from 10 to 99-----------------------------");
			
		for(int i=0; i<10; i++) {
				
				for(int j=0; j<=9; j++) {
					System.out.println(i+" "+j);
				}
		}
		System.out.println("------------car odometr-----------------------------");
	
		for(int i=0; i<10; i++) {
			for(int j=0; j<=9; j++) {
				for(int b=0; b<=9; b++) {
					for(int m=0; m<=9; m++) {
				System.out.println(i+" "+j+" "+ b +" "+m);
	}}}}
		System.out.println("------------CLOCK-----------------------------");
		
		for(int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				if(h<10 && m<10) {
					System.out.println("0"+h+":0"+m);
				}else if (h<10 && m>=10) {
					System.out.println("0"+h+":"+m);
				}else if (h>=10 && m<10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
			}
		}
System.out.println("------------CLOCK-2----------------------------");
		
		for(int h=0; h<24; h++) {
			for(int m=0; m<60; m++) {
				if(h<10) {
					if(m<10) {
					System.out.println("0"+h+":0"+m);
			        }else {
				    System.out.println("0"+h+":"+m);
			    }
				}else {
					if(m<10) {
						System.out.println(h+":0"+m);
				        }else {
					    System.out.println(h+":"+m);
				}
				
			}
			}}
		System.out.println("-----------Multiplication Table --------");
		int result;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				result=i*j;
				System.out.println(i+" x "+j+" = "+result);
			}
		}
	}}
	
	
