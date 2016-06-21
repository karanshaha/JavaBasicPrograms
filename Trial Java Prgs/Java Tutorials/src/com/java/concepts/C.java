package com.java.concepts;

public class C {
    static void m(Object o) {
            System.out.println("m(o)");
    }
    static void m(String s) {
            System.out.println("m(s)");
    }
    static void m(Integer i) {
            System.out.println("m(i)");
    }
    static <T> void f(T t) {
            m(t) ;
    }

    public static void main(String[] args) {
    	String s ="1";
            f(s);
    	/*m(s);*/
            
    }
}