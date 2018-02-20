package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo 
{
	
	public void displaylist(List<Integer> list)
	{
		for(Integer val:list)
		{
			System.out.println(val);
		}
	}
	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<Integer>();
		mylist.add(1032);
		mylist.add(2436);
		mylist.add(453460);
		mylist.add(2,234);
		Demo demo=new Demo();
		demo.displaylist(mylist);
			
		
		
		
	}


}
