package com.codebode.task;



class Employee{
	String name ;
	int year;
	float salary;
	String address ;
	
	Employee(String name1,int year1,float salary1,String address1){
		name=name1;
		year=year1;
		salary=salary1;
		address=address1;
	}
	
		
		
	
	
}
public class EmployeeTable {
 

public static void main(String[] args) {
	Employee emp1 = new Employee("Robert",1994,19000,"64C-WallsStreet");
	Employee emp2 = new Employee("Sam",2000,24000,"68D-WallsStreet");
	Employee emp3 = new Employee("John",1999,17000,"26B-WallsStreet");
	
	
	
	
	System.out.println("Name  Year of joining  Salary  Address");
	System.out.println(emp1.name+"  "+emp1.year+"      "+emp1.salary+"         "+emp1.address);
	System.out.println(emp2.name+"  "+emp2.year+"      "+emp2.salary+"         "+emp2.address);
	System.out.println(emp3.name+"  "+emp3.year+"      "+emp3.salary+"         "+emp3.address);
}

}
