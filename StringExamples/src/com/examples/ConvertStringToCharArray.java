package com.examples;
/**
 * 
 * @author Gurucharan
 * Program to convert a given string to char array
 */
public class ConvertStringToCharArray {

	public static void main(String[] args) {
	//Given string gurucharan
	String str="gurucharan";
	//convert the string to char array
	char[] charArray=str.toCharArray();
	// display the output
	for(int i=0;i<charArray.length;i++)
		System.out.println(charArray[i]);
	}

}
