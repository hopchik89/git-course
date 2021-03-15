package com.class4;

public class task {

	public static void main(String[] args) {
		
		 boolean diploma=true;
	     double gpa=3.8;
	     
	     if (diploma) {
	          System.out.println("Congratulations");
	          if (gpa>3.5) {
	                 System.out.println("you are able to for scholarship");
	          }else {
	                 System.out.println("you should have studied harder");
	             } 
	     }else {
	          System.out.println("You should get a degree");    
       	}
	     		
	     //Task2
	     
	     double rate=3.5;
	     double price=500000;
	     
	     if(rate>4.5) {
	    	 System.out.println("I will not buy a house");
	     }else {
	    	 System.out.println("I will consider buying");
	    	 if(price>200000) {
	    		 System.out.println("I need a loan");
	    	 }else {
	    		 System.out.println("I will pay cash");
	    	 }
	    	 
	    	 //or second way
	    	 if(rate<4.5) {
		    	 System.out.println("I will not buy a house");
		    	 if(price>200000) {
		    		 System.out.println("I need a loan");
		    	 }else {
		    		 System.out.println("I will pay cash");
		    	 }
		     }else {
		    	 System.out.println("I will consider buying");
		    	
		    	 }
	     }
	     
	}
}
      
	

	

