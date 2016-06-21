package com.java.concepts;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TwoWheeler extends AbstractDemo1 implements Vehicle {

	

	
	public static void main(String s[]) throws FileNotFoundException{
		TwoWheeler u = new TwoWheeler();
		u.milage1();
		String text  = "example漢字";
		PrintWriter writer = new PrintWriter("F:/example漢字.txt");
	    writer.println(text);
	    System.out.println(text);
	    writer.close();
	}

	@Override
	public void milage1() {
		System.out.println("MMM");
		
	}

}
