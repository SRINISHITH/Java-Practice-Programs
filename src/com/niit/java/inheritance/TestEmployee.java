package com.niit.java.inheritance;

public class TestEmployee {
public static void main(String[] args) {
	ContractEmployee cEmp=new ContractEmployee();
	PermanentEmployee pEmp=new PermanentEmployee();
	cEmp.setEmpNo(10);
	cEmp.setEmpName("Arpit");
	cEmp.setEmpSalary(10000);
	cEmp.setDuration(1);
	
	pEmp.setEmpNo(11);
	pEmp.setEmpName("Ajith");
	pEmp.setEmpSalary(12000);
	pEmp.setPf(500);
	System.out.println(cEmp.getEmpNo());
	System.out.println(cEmp.getEmpName());
	System.out.println(cEmp.getEmpSalary());
	System.out.println(cEmp.getDuration());
	
	System.out.println(pEmp.getEmpNo());
	System.out.println(pEmp.getEmpName());
	System.out.println(pEmp.getEmpSalary());
	System.out.println(pEmp.getPf());
}
}

