package com.codebode.task;



import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int temp;
		int n;
		int counter=0;
		System.out.print("Enter the value of n");
		n = sc.nextInt();
		
		a=0;
		b=1;
	
		
		if(n==0) {
			System.out.print("Invalid");
			
		}
		if(n>0) {
			System.out.println(a);
			counter++;
		}
		
		while(counter<n) {
			System.out.println(b);
			temp=b;
			b=a+b;
			a=temp;
			
			counter++;
			
		}

	}
}