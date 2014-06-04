package com.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingAStringArray {

	public static void main(String[] args) {
		String[] strArray={"guru","charan","gurucharan"};
		List<String> strList= Arrays.asList(strArray);
		Collections.reverse(strList);
		strArray=strList.toArray(strArray);
		for(String str: strArray){
			System.out.println(str);
		}
		
		String[] strArray2 = (String[])strList.toArray();
		for(String str: strArray2){
			System.out.println(str);
		}
		
	}

}
