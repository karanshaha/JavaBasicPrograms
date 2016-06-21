package com.java.concepts;

public class Fibanacci {
	
	public int callFiboRecursive(int n){
		if(n == 1)
	        return 0;
	    else if(n == 2)
	      return 1;
	   else
	      return callFiboRecursive(n - 1) + callFiboRecursive(n - 2);
	}
	
	
	public int FibonacciNormal(int n){
		
		if(n == 1)
			return 0; 
		else if(n == 2)
			return 1;

		
		int fibonacci = 1,fibo1 = 1, fibo2 = 1;
		for(int i=3;i<n;i++){
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		
		return fibonacci;
		
	}
	
	public static void main(String s[]){
		Fibanacci f = new Fibanacci();
		for(int i=1; i<=8; i++){ System.out.print(f.FibonacciNormal(i) +" "); }

		//System.out.println(f.callFiboRecursive(5));
	}

}
