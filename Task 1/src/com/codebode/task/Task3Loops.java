package com.codebode.task;

import java.util.Scanner;

public class Task3Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("Pick 1 for Hi 2 for Hey and 3 for Hello ");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Hii");
		break;
		case 2:
			System.out.println("Hey");
		break;
		case 3:
			System.out.println("Hello");
		break;
		
		}

	}

}
