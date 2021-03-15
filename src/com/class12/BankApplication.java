package com.class12;

public class BankApplication {
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String UserName, String Password) {
		if(userName.equals(UserName)&& password.equals(Password)) {
			System.out.println("Welcome to bank of America! Your balance is "+balance);
		}else {
			System.out.println("Username or password is not correct");
		}
	}
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your account number is "+accountNumber+". Your balance is "+balance);
		}
	}
	public void printUsernameAndPassword(String UserName, String Password) {
		System.out.println(UserName);
		if (userName.equals("Zhanna")) {
			System.out.println("Hi Zhanna");
		}else {
			System.out.println("Bye Zhanna");
		}
	}
	
	

	public static void main(String[] args) {
		BankApplication zhannasAccount= new BankApplication();
		zhannasAccount.accountNumber="123";
		zhannasAccount.userName="Zhanna";
		zhannasAccount.password="pass123";
		zhannasAccount.balance=1400;
		zhannasAccount.printUsernameAndPassword("Zhanna", "pass123");
		

	}

}
