package com.java.concepts;

public class StringImmutableExample {

	public static void main(String s[]){
		String fname = "kk";
		System.out.println(fname.toString());
		fname.concat("abc");
		System.out.println(fname.toString());
		
		StringBuffer stringBuffer = new StringBuffer("ABC");
		stringBuffer.append("XYZ");
		System.out.println(stringBuffer);
		
	}
}
