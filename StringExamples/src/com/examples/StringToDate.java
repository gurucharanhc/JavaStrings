package com.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strDate="06/04/2014";
		SimpleDateFormat s= new SimpleDateFormat("MM/dd/yyyy"); // small mm --> minutes
		Date d=null;
		try {
			d = s.parse(strDate);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
