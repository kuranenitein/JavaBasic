package encapsulation;

public class Mac1 {
public static void main(String[]args) {
	Mac m = new Mac();
	m.position("Govt Job");
	m.age(25);
	m.salary(350000);
	
	String s = m.getposition();
	int i = m.getage();
	int k= m.getsalary();
	
	System.out.println(s);
	System.out.println(i);
	System.out.println(k);
}
	
}
