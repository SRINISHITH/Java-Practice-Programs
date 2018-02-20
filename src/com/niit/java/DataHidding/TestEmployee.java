package com.niit.java.DataHidding;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("abcd");
		emp.setSalary(10000);
		emp.setGender('F');
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getGender());
	}

}
