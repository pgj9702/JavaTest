package homework_day2;

import java.util.Scanner;

public class homework_1 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score>=80) {	
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
}