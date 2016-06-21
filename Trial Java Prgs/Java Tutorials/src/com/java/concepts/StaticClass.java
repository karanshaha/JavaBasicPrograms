package com.java.concepts;

public class StaticClass {
	
	public static int a;
	
	public static void fun(){
		System.out.println("In static Method");
	}
	
	public void fun2(){
		a = 5;
	}
	
	public static void main(String s[]){
		StaticClass.fun();
		StaticClass st = new StaticClass();
		st.fun2();
		System.out.println(st.a);
		StaticClass st2 = new StaticClass();
		st2.a = 4;
		System.out.println(st2.a);
		System.out.println(st.a);
	}

}
