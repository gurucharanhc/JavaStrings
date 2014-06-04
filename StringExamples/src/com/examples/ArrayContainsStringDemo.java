package com.examples;

import java.util.Arrays;

public class ArrayContainsStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray={"Apple","Banana","Orange"};
		String str1="Apple";
		String str2="Grapes";
		boolean contains= false;
		
		contains=Arrays.asList(strArray).contains(str1);
		System.out.println(" Contains = "+ contains);

		contains=Arrays.asList(strArray).contains(str2);
		System.out.println(" Contains = "+ contains);
	}

}
