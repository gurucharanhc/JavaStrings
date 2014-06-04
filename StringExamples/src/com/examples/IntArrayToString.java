package com.examples;

import java.util.Arrays;

public class IntArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray={1,2,3,4,5};
		StringBuffer stringBufferObj= new StringBuffer();
		if(intArray.length>0) stringBufferObj.append(intArray[0]);
		for(int i=1;i<intArray.length;i++)
		{
			stringBufferObj.append(intArray[i]);
		}
		System.out.println(stringBufferObj.toString());
		
		String str=Arrays.toString(intArray);
		System.out.println(str);
		
		str=str.replaceAll(",", "").replace("[","").replace("]", "");
		System.out.println(str);
				
	}

}
