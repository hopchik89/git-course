package reviewClass2;
import java.util.Scanner;
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    boolean loan;
	    int score;
	    String eligibility = null;

	    System.out.println("Do you need a loan?");
	    loan=scan.nextBoolean();
	    if (loan) {
	    System.out.println("What is your credit score?");
			score=scan.nextInt();
	      if(score<600) {
			 eligibility="Not eligible";
		  	}else if(score>=600 && score<=700) {
			eligibility="Maybe eligible";
			  }else if(score>=701 && score<=800) {
			eligibility="Eligible";
		  	}else {
					eligibility="Definitely eligible";
					
			}System.out.println("The eligibility is "+eligibility);
	    }else {
	      System.out.println("Unknown");
	    }
	    
	  }

	}

