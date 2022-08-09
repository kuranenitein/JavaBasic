package encapsulation;

public class Student {

	private String name;
	private int std;
	private int rollno;
	
	public void setname(String name) {
		this.name=name;
	}
	public void setstd(int std) {
		this.std=std;
	}
	public void setrollno(int rollno) {
		this.rollno=rollno;
	}
	
	
	public String getname() {
		  return name;
	}
	public int getstd() {
		return std;
	}
	public int getrollno() {
		return rollno;
	}
	}
