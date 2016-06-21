package com.java.concepts;

public class GarbageCollection{
	
	
	public static void main(String s[]){
		/*Object o = new Object();
		System.out.println(o.toString());*/
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("In finalize");
		super.finalize();
	}
	
}