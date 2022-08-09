 package nonPrimitiveCasing;
class One{
	public static void data() {
		System.out.println("hello");
	}
}
class Two extends One{
	public static void data() {
		System.out.println("hello new ");
	}
}
public class Upcasting {
	
	
	public static void main(String[]args)
	{
		One ha=new Two();
		ha.data();
//		Father f = new Son();
//		f.method();
//		Son s = (Son)f;
	}

}
