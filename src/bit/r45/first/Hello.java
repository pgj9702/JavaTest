package bit.r45.first;

import java.io.IOException;
import bit.r45.membres.*;

public class Hello {

	// ¸â¹ö ÇÊµå

	public static void main(String[] args) {
//		Student student;
//		student = new Student();
//		
//		student.run();
//		student.setAge(100);
//		student.run();
		
		printVar();

	}

	static void printVar() {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0;i<5;i++)
		{
			var1++;
			var2++;
			System.out.println("var1 : "+var1 + "\t" + "var2 : " + var2);
			
		}
	}
}
