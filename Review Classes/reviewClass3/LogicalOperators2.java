package reviewClass3;

public class LogicalOperators2 {

	public static void main(String[] args) {
		int number=1000;
		
		/*
		 * if the variable number contains a value betweeb 0 to print("0 to 100")
		 * otherwise print("out of range");
		 */
		//Without Logical Operators
		if(number>=0) {
			if(number<=0) {
				System.out.println("0 to 100");
			}
		}else {
			System.out.println("Out of range");
		}
		//With Logical Operators
		if(number>=0 && number<=100) {
			System.out.println("0 to 100");
		}else {
			System.out.println("Out of range");
		}
		
		if(number>=0 && number<=100) {
			System.out.println("Checking");
		System.out.println("Checking");
		}
	}

}
