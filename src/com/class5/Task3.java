package com.class5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores
		 *  (quiz, mid term, and final scores) 
		 *  and determine the grade based on the following rules:
		 *   if the average score >=90  grade=A
         *   if the average score >= 70 and <90 grade=B
		 *   if the average score>=50 and <70  grade=C
         *   if the average score<50  grade=F
		 */
		Scanner scan;
		scan=new Scanner(System.in);
		
		System.out.println("Enter your quiz: ");
		double quiz=scan.nextDouble();
		System.out.println("Enter your mid term: ");
		double mid=scan.nextDouble();
		System.out.println("Enter your final scores: ");
		double fin=scan.nextDouble();
		double score=(quiz+mid+fin)/3;
		double grade;
		if (score<50) {
			grade='F';
		}else if(score>=50 && score<70) {
			grade='C';
		}else if(score>=70 && score<90) {
			grade='B';
		}else if(score>=90) {
			grade='A';
		}else {
			grade='D';
		}
		System.out.println("Your GPA is "+grade);
		
		if (grade=='A' || grade =='B') {
			System.out.println("I am happy!!!");
		}
			}
		
		
	}


