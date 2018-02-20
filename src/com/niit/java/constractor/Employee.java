package com.niit.java.constractor;

public class Employee {
private int id;
private String name;
private int salary;
public Employee(int id,String name,int salary)
{this.id=id;
this.name=name;
this.salary=salary;
}
public static void main(String[] args) {
	Employee emp=new Employee(100,"dipika",20000);
	System.out.println(emp.id);
	System.out.println(emp.name);
	System.out.println(emp.salary);
}
}
