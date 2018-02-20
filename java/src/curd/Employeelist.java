package curd;

import java.util.ArrayList;
import java.util.List;

public class Employeelist 
{
	public void displayEmployee(List<Employee> empList)
	  {
		for(Employee emp:empList)
	     {
			System.out.println(emp.getId());
	        System.out.println(emp.getName());
	        System.out.println(emp.getSalary());
	     }
	   }
	 
	public List<Employee> createEmployeeList()
	 {
		List<Employee> employeelist=new ArrayList<Employee>();
	    Employee emp;
	    emp=new Employee(1,"sri",20000);
	    employeelist.add(emp);
	    emp=new Employee(2,"archana",25000);
	    employeelist.add(emp);
	    emp=new Employee(3,"vignesh",20000);
	    employeelist.add(emp);

	    emp=new Employee(4,"gorge",20000);
	    employeelist.add(emp);
	    return employeelist;
	  }
}
