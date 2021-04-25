package com.codebode.task;

import java.util.Scanner;

public class Task2MethodInPackages {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
      
	    	double years;
	    	 double minutes;
	    	 double days;
	    	 minutes=sc.nextDouble();
	    	 days=minutes/1440;
	    	years =(long) minutes/525600;
	    	days = (long)(years)*365-days;
	    	if(days<0)
	    	{
	    		days=-days;
	    	}
	   
		
	    
	 
	   
	    System.out.println(minutes+"minutes is approximately "+years+"years and days are"+days);
	    
		
		
	}

}
