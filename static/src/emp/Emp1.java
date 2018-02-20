package emp;

public class Emp1 extends Emp{
private static int count=0;
	 public  int Emp()
	 { 
		 return count++;
	 }
		public static int getcount()
		{
			return count;
		}
		  private  Emp emp1;
			public static void main(String[] args) {
				Emp emp1 = new Emp();
				Emp emp2 = new Emp();
				Emp emp3 = new Emp();
				Emp emp4 = new Emp();
				Emp emp5 = new Emp();
				Emp emp6 = new Emp();
				Emp emp7 = new Emp();
				System.out.println(Emp.getcount());
			}
			 
			
			
			
	
			 
}

