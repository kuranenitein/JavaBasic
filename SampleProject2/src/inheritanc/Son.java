package inheritanc;

public class Son extends Father {
	
	public void bike()
	{
		System.out.println("this is sons bike");
	}

	  public static void main(String[]args)
	  {
		  Son a=new Son();
		  a.bike();
		  a.car();
		  a.house();
	  }
}