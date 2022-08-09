package encapsulation;

public class Studentlib {
	
	public static void main(String[]args) {

	Student a =new Student();
	a.setname("Nitein");
	a.setstd(4);
	a.setrollno(47);
	String s=a.getname();
	int st= a.getstd();
	int r= a.getrollno();
	System.out.println(s);
	System.out.println(st);
	System.out.println(r);
	
}}
