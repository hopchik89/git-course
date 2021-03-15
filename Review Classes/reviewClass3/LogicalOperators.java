package reviewClass3;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * logical operators are used to combine multiple conditions in the same if block
		 */
//Without Logical Operators
		String day="Sunday";
		System.out.println("Relax its weekend dont blink otherwise its over");
		if("Sunday".equals(day)) {
			System.out.println("Relax Its weekend don't blink otherwise it's over");
		}else if(day.equals("Suturday")) {
			System.out.println("Relax Its weekend don't blink otherwise it's over");
		}else {
			System.out.println("I have to go to work");
		}
		//Using Logical operators
		if("Sunday".equals(day) || day.equals("Saturday")) {
			System.out.println("Relax its weekend dont blink otherwise its over");
		}else {
			System.out.println("I have to go work");
		}
	}

}
