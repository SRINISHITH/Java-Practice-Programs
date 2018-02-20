package arraylist;
import java.util.ArrayList;
import java.util.List;

public class Stringlist 
{
	public void displaylist(List<String> list)
	//{
		//for(String v:list);
	
		{
			System.out.println();
		}
	//}
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("sri");
		list.add("vignesh");
		list.add("gorge");
		list.add(1,"Archana");
	    Stringlist demo=new Stringlist();
		demo.displaylist(list);
    }
}