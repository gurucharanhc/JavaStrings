package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray ={"guru","charan","hc"};
		List<String> strList= (List<String>)Arrays.asList(strArray);
		for(int i=0;i<strList.size();i++){
			System.out.println(strList.get(i));
		}

		List<String> strList2= new ArrayList<String>();
		Collections.addAll(strList2, strArray);
		for(String s: strList2){
			System.out.println(s);
		}
		
		String str3="guru";
		String str4="Guru";
		// returns the difference between the string first mismatch character
		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareToIgnoreCase(str4));
		
		String str5= str3.concat(str4);
		System.out.println("Concatenate using string concat opetation "+str5);
		
		String str6=new StringBuffer().append(str3).append(str4).toString();
		System.out.println("Concatenate using StringBuffer "+str6);
		
		boolean flag= str4.contains("guru");
		System.out.println(flag); //false
		
		flag= str4.contains("Guru");
		System.out.println(flag);// true
		
		String orgStr="Hello World";
		String revStr=new StringBuffer(orgStr).reverse().toString();
		System.out.println(revStr); //dlrow olleh
		
		String str7="hello-gurucharan-how are you?";
		String delimiter = "-";
		String[] splitStr=str7.split(delimiter,2); // 2 means make 2 array .. 1 means keep it as
		String[] splitStr1=str7.split(delimiter); // use default operation
		for(String s: splitStr){
				System.out.println(s);
		}
		
		for(String s: splitStr1){
			System.out.println(s);
		}
		/**
		 * Some special characters need to be escaped while providing them as
		 * delimiters like "." and "|".
		 */
		String str8="abc.abc.com";
		String delimiter1="\\."; 
		String[] splitStr2=str8.split(delimiter1);
		for(String s: splitStr2){
			System.out.println(s);
		}
		
		String str9=" GURU CHARAN ";
		System.out.println("original string ="+str9);
		System.out.println("Removed Leading and trailing space");
		System.out.println("Trim operation on String ="+str9.trim());
		/**
		 * check whether String ends with World or not.
		 * endsWith() method returns true if a string is ending with a given word
		 * otherwise it returns false
		 */
		System.out.println("Ends with demo = "+str9.endsWith(" ")); // true
		System.out.println("Ends with demo = "+str9.endsWith("N ")); // true
		System.out.println("Ends with demo = "+str9.endsWith("CHARAN ")); // true
		/**
		 * startWIth demo
		 */
		System.out.println("starts with demo = "+str9.startsWith(" ") );// true
		System.out.println("starts with demo = "+str9.startsWith(" G") );//true
		System.out.println("starts with demo = "+str9.startsWith(" GURU") );//true
		System.out.println("starts with demo = "+str9.startsWith(" G",3)); // false " G" should start from 3 
		
		/**
		 * isEmpty Demo()
		 */
		String str10="";
		String str11="Guru";
		String str12=null;
		System.out.println("str10 = "+str10.isEmpty());
		System.out.println("str11 = "+str11.isEmpty());
		//System.out.println("str12 = "+str12.isEmpty()); // null pointer exception
		
		/**
		 * String to List
		 */
		String str13="1,2,3,4,5";
		String delimiter2=",";
		String[] strListArray=str13.split(delimiter2);
		List<String> strList3= (List<String>) Arrays.asList(strListArray);
		for(String s: strList3)
				System.out.println(s);
		
		/**
		 * String to ArrayList
		 */
		ArrayList<String> strList4= new ArrayList<String>(Arrays.asList(strListArray));
		System.out.println(strList4);
		
		for(String s: strList4){
			System.out.println(s);
		}
	}

}
