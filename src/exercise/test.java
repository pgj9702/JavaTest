package exercise;

import java.util.*;

public class test {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ���. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("����Դϴ�.");
		}
		else if(num<0) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("0 �Դϴ�.");
		}
	}
}