package com.class11;

public class GroupTask5 {

	public static void main(String[] args) {
		/*
		 *9. Write a java program to find the second largest number in the array?
		 */
		
		int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;
	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second largest number is: "+array[size-2]);
		
	      System.out.println("----ANOTHER WAY-----");
	      
	      int[]arr2= {900,20,300, 300,145,89,76,45,0,-6,125,900,145};
			
			int large, secondLarge;
			
			large=0;
			secondLarge=0;
			
			for(int i=0;i<arr2.length;i++) {
				if(arr2[i]>large) {
					secondLarge=large;
					large=arr2[i];
				}else if(arr2[i]>secondLarge && arr2[i]!=large) {
					secondLarge=arr2[i];
				}
				
			}
			System.out.println(secondLarge);
	}

	}

