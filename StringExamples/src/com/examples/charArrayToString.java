package com.examples;

import java.util.Arrays;

/**
 * 
 * @author Gurucharan
 * program to convert the char array to String
 *
 */
public class charArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an char array
		char[] charArray={'g','u','r','u'};
		// Note this will convert the base address of the charArray and store it in string
		String str=charArray.toString();
		System.out.println(str);
		
		//copy the char array to string
		String str1= new String(charArray);
		System.out.println(str1);
		
		String str2= Arrays.toString(charArray);
		System.out.println(str2);
	}

}
