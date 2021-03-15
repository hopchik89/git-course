package com.class6;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="HELLO";
		String str1="hello";
		
		boolean yesOrNo=str.equals(str1); //false
		System.out.println(yesOrNo);
		
		boolean yesOrNo1=str.equalsIgnoreCase(str1); //true
		System.out.println(yesOrNo1);
	}

}
