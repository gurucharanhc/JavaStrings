package com.examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * @author Gurucharan
 * Program to convert a data present in a text file to a string
 */
public class ConvertInputStreamToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream=null;
		try {
			inputStream= new FileInputStream("c:/guru.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
			e.printStackTrace();
		}
		
		//create buffer reader object
		BufferedReader br= new BufferedReader(new InputStreamReader(inputStream));
		StringBuffer strBuffer= new StringBuffer();
		String readLine=null;
		try {
			while((readLine=br.readLine())!=null)
			{
				strBuffer.append(readLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem with reading the file");
			e.printStackTrace();
		}
		System.out.println(strBuffer.toString());
		
	}

}
