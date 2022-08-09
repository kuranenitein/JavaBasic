package interfac;

public interface Interface3 extends Interface2, Interface1 {

	void thirdname();
	static void age() {
		System.out.println("30");
	}
	public static void main(String[]args) {
		
			Interface3.age();
	}
}
