package homework_day2;

import java.util.Scanner;

public class homework_2 {

	public static void main(String[] args) {
		System.out.print("1���� n������ �� ���ϱ�\nn�� �Է��ϼ���. :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int sum = 0, i = 0;

		for(i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " �� : " + sum);

	}

}