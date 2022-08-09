package interfac;

public class ImplementationClass implements Interface3 {
	
	public void firstname() {
		System.out.println("Nitein");
	}
	public void middlename() {
		System.out.println("Ananda");
	}
	public void thirdname() {
		System.out.println("Kurane");
	}

	public static void main(String[]args)
	{
		ImplementationClass i = new ImplementationClass();
		i.firstname();
		i.middlename();
		i.thirdname();		
	}
}
