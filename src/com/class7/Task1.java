package com.class7;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("---------print numbers from 1 to 100-------");

		int num=1;
		while(num<=100) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();

		System.out.println("---------print numbers from 100 to 1-------");
	
		int num2=100;
		while(num2>=1) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println();
	
		System.out.println("---------print numbers from 20 to 100-------");
	
		int num3=20;
		while (num3<=100) {
			System.out.print(num3+" ");
			num3++;
		}
		System.out.println();
		
		System.out.println("-----tolko chetnie ot 20 do 100------");
		int a=20;
		while (a<=100) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		
		
	}

}
