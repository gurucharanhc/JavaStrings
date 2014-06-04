package com.examples;
/**
 * @author Gurucharan
 * program to convert a date to a string object
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		DateFormat dateFormate= new SimpleDateFormat("dd-MM-YYYY");
		//System.out.println(dateFormate);
		String str= dateFormate.format(d);
		System.out.println(str);
		
		String str1=d.toString();
		System.out.println(str1);
		
		//local timings
		System.out.println(d.toLocaleString());
		//GMT specified timings
		System.out.println(d.toGMTString());

	}

}
