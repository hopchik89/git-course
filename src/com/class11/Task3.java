package com.class11;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian.
		 *  Then retrieve all values from that array using 2 different loops
		 */
		String[][] cars= {
				{"Jeep","Tesla","Hummer","Ford","Buick","Chevrolet"},
				{"Audi","BMW","Maybach","Mercedes","Porsche","Volkswagen","Opel"},
				{"Kia","Hyundai","Daewoo","Renault Samsung","Ssang Yong"},
				{"Alfa Romeo","Ferrari","Lamborghini","Lancia","Maserati","Fiat"}
		};
		for (String[] marks:cars) {
			for (String mark:marks) {
				System.out.print(mark+" ");
	}
			System.out.println();
}
System.out.println("==================== Task 2 ===========================");
		/*
		 * Using 2D array create a grocery list.
		 * Inside you should have an array of veggies, fruits,
		 *  dairy and sweets.
		 *  Retrieve all values from that array using 2 different loops
		 */
		String[][] fruits = {
				{ "Tomato", "Celery", "Onions" },
				{ "Apple", "Melon", "Orange" }, 
				{ "Milk", "Cheese" },
				{ "Chocolate", "Paneer", "Jelly", "Creampie" } 
				};
		for (int row = 0; row < fruits.length; row++) {
			for (int col = 0; col < fruits[row].length; col++) {
				System.out.println(fruits[row][col] + " ");
			}
			System.out.println("-------------------");
		}
		System.out.println("============   Nested For Each Loop  =============");
		for (String[] frt : fruits) {
			for (String f : frt) {
				System.out.println(f);
			}
			System.out.println("-------------------");
	}
}
	}
