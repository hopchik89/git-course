package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner
		 * calculate the sum of all stored elements in that array
		 */

		Scanner scan=new Scanner(System.in);
		double sum=0;
		
		System.out.println("How many Double Values would you like to store");
		int size=scan.nextInt();
		double[] a=new double[size];
		for(int i=0; i<size; i++) {
			a[i]=scan.nextDouble();
			sum+=a[i];
		}
		System.out.println("The sum of "+size+" elements from an array ="+sum);
		//vtoroi sposob sdelat summu for each loop
		sum=0;
		for(double num:a) {
			sum+=num;
		}
		System.out.println("The sum of "+size+" elements from an array ="+sum);

	}}
