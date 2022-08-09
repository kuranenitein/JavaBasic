package inheritanc;

public class Grandson extends Son {
	
	public void bicycle()
	{
		System.out.println("this is grandsons bicycle");
	}
	
	public static void main(String[]args)
	  {
		  Grandson a=new Grandson();
		  a.bike();
		  a.car();
		  a.house();
		  a.bicycle();
		  
	  }

}
