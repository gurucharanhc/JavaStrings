package com.examples;

import java.text.Collator;
import java.util.Arrays;

public class StringArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strArray = {"guru","Guru","GUru","charan","CHARAN","GURU"};
		Arrays.sort(strArray);
		for(String str:strArray){
			System.out.println(str);
		}
		System.out.println("==================");
		String[] strArray1 = {"guru","Guru","GUru","charan","CHARAN","GURU"};
		Arrays.sort(strArray1, Collator.getInstance());
		for(String str: strArray1){
			System.out.println(str);
		}
	}

}
