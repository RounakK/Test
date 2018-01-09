package com;

import java.util.Scanner;

public class fibonacci_rec {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();
		int[] fib = new int[range];
		fibonacci_rec f = new fibonacci_rec();
		System.out.println(f.fibonacci(range));
		
		
	}
	
	public int fibonacci(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return (fibonacci(n-1)+fibonacci(n-2));
	}

}
