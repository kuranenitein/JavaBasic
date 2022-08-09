package abstraction;

abstract public class AbstractClass {
	
	abstract public void  meth();
	
	public static void meth0() {
		
		System.out.println("Hello");
	}


public static void main(String[]args)
{
	System.out.println("Main method");
	AbstractClass.meth0();
}
}