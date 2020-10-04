package homework_day2;

import java.util.Scanner;

public class homework_3 {

	public static void main(String[] args) {

		boolean run = true;		
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.print("선택: ");
			}

			Scanner scanner = new Scanner(System.in);
			keyCode = scanner.nextInt();
			scanner.close();
			
			if (keyCode == 1) { //1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 2) { //2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 3) { //3
				run = false;
			}
		}	
		
		System.out.println("프로그램 종료");
	}

}
