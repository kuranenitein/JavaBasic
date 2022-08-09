package nonPrimitiveCasing;

public class FatherSonmain {
	
	public static void main(String[]args) {
		Son a = new Son();
		a.method();
		//a.method1();
		
		Father f = new Son();
		f.method();
		
		Son s =(Son) f;
		s.method();
		//s.method1();
	}

}
