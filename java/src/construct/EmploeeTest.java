package construct;

public class EmploeeTest {
public static void main(String[] args) {
	Employee emp=new Employee(1,"sri",20000);
	System.out.print(emp.getId());
	System.out.print(emp.getName());
	System.out.print(emp.getSalary());

}
}
