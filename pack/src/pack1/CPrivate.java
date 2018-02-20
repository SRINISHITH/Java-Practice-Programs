package pack1;

public class CPrivate {
	
 private void PrivateMethod()
 {
	 System.out.println("this is private");
 }
 public void PublicMethod()
 {
	 System.out.println("this is public");
 }
 protected void ProtectedMethod()
 {
	 System.out.println("this is protected");
 }
 void defaultMethod()
 {
	 System.out.println("this is default");
 }

  public static void main(String[] args) {
	  CPrivate c = new CPrivate();
	  c.PrivateMethod();
  }
	
}

