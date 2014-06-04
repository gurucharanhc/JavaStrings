package com.examples;

public class IndexOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="guru charan hc guru";
		
		int i=str.indexOf("guru");
		System.out.println(i); // out put zero
		
		i= str.indexOf("guru", 5);
		System.out.println(i); // out put 15
		
		i=str.lastIndexOf("guru", 15);
		System.out.println(i);
		
		i=str.lastIndexOf("guru", 10);
		System.out.println(i);
		
		i=str.lastIndexOf("guru");
		System.out.println(i);
	}

}
