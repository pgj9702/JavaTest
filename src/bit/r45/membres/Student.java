package bit.r45.membres;

public class Student {

	int age;
	
	public void run() {
		int x = 1;
		int y = 2;
		
		int result = x + y;
		
		System.out.println(x+" + "+y+" = "+result);
		System.out.println(age);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
