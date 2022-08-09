package abstraction;

abstract public class ConcreteClass extends AbstractClass {
	
	public void meth() {
		
		System.out.println("Hello");
	}
	
	abstract public void meth1();
	abstract  public void meth2();
	
	public static void main(String[]args)
	{
		System.out.println("Main method");
	}
	
}
