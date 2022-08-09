package encapsulation;

public class Mac {

	private String position;
	private int age;
	private int salary;
	
	public void  position(String position) {
		this.position = position;
	}
	public void age(int age) {
		this.age=age;
	}
	public void salary(int salary) {
		this.salary= salary;
	}
	
	
	public String getposition() {
		return position;
	}
	public int getage() {
		return age;
	}
	public int getsalary() {
		return salary;
	}
}
