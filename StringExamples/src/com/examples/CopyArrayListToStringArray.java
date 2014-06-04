package com.examples;
/**
 * @author Gurucharan
 * program to CopyArrayListToStringArray 
 * 
 * note: object array used as an intermediate to copy from array list to string array 
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayListToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array list
		ArrayList<String> arrayList= new ArrayList<String>();
		arrayList.add("guru");
		arrayList.add("charan");
		arrayList.add("gurucharan");
		
		// toArray returns the object array
		Object [] objArray = arrayList.toArray();
		//declare an stringarray to hold objArray values
		String[] strArray= Arrays.copyOf(objArray, objArray.length,String[].class);
		for(String s: strArray){
			System.out.println(s);
		}
		//Note : String[] strArray= Arrays.copyOf(objArray, objArray.length); not possible 
		//to use this as it will throw class cast exception
	}

}
