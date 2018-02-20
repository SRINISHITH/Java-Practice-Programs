package com.niit.java.AccessSpecifier1;

public class Class1 {
public void publicMethod()
{System.out.println("This is public");}

private void privateMethod()
{System.out.println("This is private");}

protected void protecedMethod()
{System.out.println("This is protected");}

void defaultMethod()
{System.out.println("This is default");}
public static void main(String[] args) {
	Class1 c=new Class1();
	c.publicMethod();
	c.privateMethod();
	c.protecedMethod();
	c.defaultMethod();
}
}


