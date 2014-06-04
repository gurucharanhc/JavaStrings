/**
 *@author Gurucharan
 *Java program to identify the valid numbers in a give StringArray 
 */
package com.examples;

public class ValidNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= new String[] {"123","123.1","guru.1","1.guru","charan.charan"};
		for(int i=0;i<s.length;i++)
		{
			/*to check whether a decimal point is present in a string or not*/
			if(s[i].indexOf(".")>0){
				try{
					Double d = Double.parseDouble(s[i]);
					System.out.println(s[i] + " is valid double number");
				}
				catch(Exception e){
					System.out.println(s[i] + " is invalid number");
				}
			}
			else{
				try{
					Integer myint = Integer.parseInt(s[i]);
					System.out.println(s[i] + " is valid integer number");
				}
				catch(Exception e){
					System.out.println(s[i] + " is invalid number");
				}
			}
		}
	}

}

