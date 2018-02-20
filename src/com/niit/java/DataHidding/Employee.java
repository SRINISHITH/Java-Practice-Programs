package com.niit.java.DataHidding;

public class Employee {
private int id;
private String name;
private int salary;
private char gender;

public void gender(char gender)
{if(gender=='F'|| gender=='M')
	this.gender=gender;
else
{System.out.println("invalid gender");}
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

}
