package reviewClass2;

public class ProperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="Salma";
		String password="Salma123";
		boolean isAllowes=true;
		double accountBalance=1000;
		double amountToTransfer=3000;
		
		if(userName.equals("Salma")) {
			if(password.equals("Salma123")) {
			    System.out.println("Welcome to Syntax bank");
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
