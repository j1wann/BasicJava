package kr.or.ddit.study05;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}

	public void method1() {
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println(i + "번");
		}

	}

	public void method2() {
		int i = 1;
		while (i > 0) {
			i = i + 100;
			System.out.println(i);
		}
	}

	public void method3() {
		String menu = "** 커피메뉴 **\n";
		menu += "1. 아메리카노\t 3000원\n";
		menu += "2. 카페라떼\t 3500원\n";
		menu += "3. 카라멜 마끼아또\t 4000원\n";
		menu += "4. 딸기에이드\t 4000원\n";
		menu += "5. 종료";
		String bill = "";
		int sum = 0;

		while (true) {
			System.out.println(menu);
			System.out.println("음료를 선택하세요");
			int choice = sc.nextInt();
			if (choice == 1) {

				sum += 3000;
				bill += "아메리카노\n";
				System.out.println(bill);
			}
			if (choice == 2) {

				sum += 3000;
				bill += "카페라떼\n";
				System.out.println(bill);
			}
			if (choice == 3) {

				sum += 3000;
				bill += "카라멜 마끼아또\n";
				System.out.println(bill);
			}
			if (choice == 4) {

				sum += 3000;
				bill += "딸기라떼\n";
				System.out.println(bill);
			}
			if (choice == 5) {
				System.out.println("종료");
				System.out.println("총 주문금액 : " + sum);

				break;
			}
		}

	}
	public void method4() {
		int i = 1;
		do {
			System.out.println(i+++"번 실행");
		}while(i<10);
				
		
	}
}