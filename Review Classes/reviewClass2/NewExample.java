package reviewClass2;

import java.util.Scanner;

public class NewExample {

	public static void main(String[] args) {
		
		String userName;
		String password;
		System.out.println("Please enter your Username");
		Scanner scaner=new Scanner(System.in);
		userName=scaner.next();
		System.out.println("Please enter your password");
		password=scaner.next();
		double accountBalance=1000;
		double amountToTransfer;
		
		if(userName.equals("Salma")) {
			if(password.equals("Salma123")) {
			    System.out.println("Welcome to Syntax bank");
			    System.out.println("Please enter the amount to transfer");
			    amountToTransfer=scaner.nextDouble();
			    if(accountBalance>=amountToTransfer) {
			    	System.out.println("Amount transfered");
			    }else {
			    	System.out.println("insufficient balance");
			    }
			}else {
				System.out.println("Incorrect password");
			}
		} else {
			System.out.println("Your username is not correct please try again");
		}


	}

}
