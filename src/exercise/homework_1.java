package homework_day2;

import java.util.Scanner;

public class homework_1 {

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���. : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();
		
		if(score>=90) {
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else if(score>=80) {	
			System.out.println("������ 80~89 �Դϴ�.");
			System.out.println("����� B �Դϴ�.");
		} else if(score>=70) {
			System.out.println("������ 70~79 �Դϴ�.");
			System.out.println("����� C �Դϴ�.");
		} else {
			System.out.println("������ 70 �̸� �Դϴ�.");
			System.out.println("����� D �Դϴ�.");
		}
	}
}