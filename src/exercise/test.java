package exercise;

import java.util.*;

public class test {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수입니다.");
		}
		else if(num<0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0 입니다.");
		}
	}
}