package com.niit.java.finaldemo;

public class SubAccount extends Account {
public int getBalance()              // cannot override because method is specified as final in parent class
{return 200;}
public static void main(String[] args) {
	SubAccount sa=new SubAccount();
	System.out.println(sa.getBalance()); 
}
}
