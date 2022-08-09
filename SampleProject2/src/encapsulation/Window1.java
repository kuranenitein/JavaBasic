package encapsulation;

public class Window1 {
	
	public static void main(String[] args) {
		Window win = new Window();
		win.setname("Arshad");
		win.setrollno(10);
		
		System.out.println("Name is:"+win.getname());
		System.out.println("Rollno. is :"+ win.getrollno());
		
		
	}
	

}
