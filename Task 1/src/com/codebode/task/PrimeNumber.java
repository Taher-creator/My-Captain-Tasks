package com.codebode.task;



import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		int i,flag=1;
		for(i=2;i<num/2;i++)
		{
			if(num%i==0)
				flag=0;
		}
		if(flag==1)
			System.out.print("PrimeNumber");
		else
			System.out.print("Not a Prime Number");

	}

}
