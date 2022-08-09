package polymorphism;

public class CompilePoly {

	public void meth(int a) {
		System.out.println("METHOD WITH SINGLE ARGUMENT");
	}
	public void meth(int a, int b) {
		System.out.println("Method with two arguments");
	}
	public static void main(String[]args) {
		
		 CompilePoly a = new CompilePoly();
		 a.meth(2);
		 a.meth(10,12);
	
}
}
