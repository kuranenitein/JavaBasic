package polymorphism;

public class RunPoly2 extends RunPloy1 {
	
	public void method() {
		System.out.println("This is from Son Class");
	}
	
	public static void main(String[]args) {
		
		 
		RunPoly2 a = new RunPoly2();
		a.method();
		
		RunPloy1 b = new RunPloy1();
		b.method();
		
	}

}
