package com.class6;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country, language;
		country=scan.nextLine();
		switch(country.toLowerCase()) {
		case "usa":
			language="English";
			break;
		case "china":
			language="Mandarin";
			break;
		case "austria":
			language="English";
			break;
		case "poland":
			language="Polish";
			break;
		case "kazakhstan":
			language="Kazakh";
			break;
		case "angola":
			language="Portuguese";
			break;
		case "bangladesh":
			language="Bengali";
			break;
		case "canada":
			language="English, French";
			break;
		default:
			language="unknown";
		}
		System.out.println(language);
	}


}
