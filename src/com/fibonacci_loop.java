package com;

import java.util.Scanner;

public class fibonacci_loop {

	public static void main(String[] args) {
		fibonacci_loop f = new fibonacci_loop();
		int[] fib = f.fibonacci();
		for(Integer i:fib) {
			System.out.print(i+" ");
		}
		System.out.println(fib.getClass().getName());
		System.out.println();
		
	}
	
	public int[] fibonacci() {
		System.out.println("Enter the range");
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();
		int[] fib = new int[range];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<range;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib;
	}

}
