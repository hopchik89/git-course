package com.class7;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("-----Print numbers from 1 to 100-------");
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println();

		
		System.out.println("-----Print numbers from 100 to 1-------");
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("-----Print EVEN numbers from 20 to 1-FIRST WAY------");
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("-----Print EVEN numbers from 20 to 1-SECOND WAY------");
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("-----Print ODD numbers from 20 to 50 -first WAY------");
		for(int i=20; i<=50; i++) {
			if(i%2==1) {
			System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("-----Print ODD numbers from 20 to 50-SECOND WAY------");
		for(int i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----what is my output----");
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("-----what is my output----");
		int result=0;
		for(int i=2; i<10; i+=2) {
			result+=i;
		}
		System.out.println(result);
		
		/*HOME WORK
		 * calculate sum of odd and even numbers from 1 to 50
		 */
	}

}
