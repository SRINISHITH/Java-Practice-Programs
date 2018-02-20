package com.niit.java.arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
public void displaylist(List<Integer> list)
{for(Integer val:list)
	{System.out.println(val);}
}
public static void main(String[] args) {
	List<Integer> mylist=new ArrayList<Integer>();
	mylist.add(10);
	mylist.add(20);
	mylist.add(30);
	mylist.add(1,15);
	ArraylistDemo demo=new ArraylistDemo();
	demo.displaylist(mylist);
		
	
	
	
}
}
