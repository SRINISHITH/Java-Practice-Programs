package com.niit.java.staticdemo;

public class Employee {
	private static int count=0;
	public Employee()  //constructor
	{count++;} //constructor call whenever object is created
	public static int getcount()
	{return count;}
	
public static void main(String[] args) {
	Employee a=new Employee();
	Employee b=new Employee();
	Employee c=new Employee();
	Employee d=new Employee();
	Employee e=new Employee();
	Employee f=new Employee();
	System.out.println(Employee.getcount());
}
}
