package com.class11;

public class GroupTask4 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */
		
    int[] inputArray={-2,564,7894,15216,41161,51651651};
    int minValue=0;
    int maxValue = inputArray[0];
		    for(int i=0;i < inputArray.length;i++){
		      if(inputArray[i] > maxValue){
		         maxValue = inputArray[i]; }
		
		  // Method for getting the minimum value
		  
		    minValue = inputArray[0];
		    for(int b=0;b<inputArray.length;b++){
		      if(inputArray[b] < minValue){
		        minValue = inputArray[b];
		       }
		      }
	  			
		   } System.out.println("Maximum value in the array is: " +maxValue);
 		  
			System.out.println("Minimum value in the array is: " +minValue);
	
			System.out.println("---------ANOTHER WAY-----");
			
			int[]arr= {-20,10,9,5,6,7,34,88,0,156};
			int max,min;
			min=arr[0];
			max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(!(arr[i]>min)) {
					min=arr[i];
				}else {
					max=arr[i];
				}
			}
			System.out.println(max+" is maximum number");
			System.out.println(min+" is minimum number");
			
			System.out.println(" ------ANOTHER WAY-----");
			
			int [] num4=  {4,3,-2,4,7,12,13,15,};
			int small= num4[0];
			int large=num4[0];
			for (int i=0; i<num4.length; i++) {
			if (num4[i] <small) small= num4[i];
			if (num4[i] >large) large=num4[i];
			}
			System.out.println(" the smallest number is  "+small+" and the largest number is "+large);
	}}