package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork03 obj = new HomeWork03();
		
//		 obj.question1();
		obj.question2();
	}

	public void question1() {

		/*
		 * question 변수에 랜덤숫자 1~100이 입력되어있음
		 * 
		 * if문 조건식을 완성하여 해당 숫자를 맞추는 프로그램을 완성하시오
		 * 
		 * 1번 시행시 cnt 값이 1 증가되어야 함
		 * 
		 * Math.random() 0~0.999999 double값 랜덤
		 */
		int question = (int) (Math.random() * 100) + 1;
		int cnt = 0;

		while (true) {
			System.out.print("숫자를 입력하세요 (1 ~ 100) : ");
			int ans = sc.nextInt();
			cnt++;
			if (question < ans) {
				System.out.println("더 작은 수를 입력하세요");
			}
			if (question > ans) {
				System.out.println("더 큰 수를 입력하세요");
			}
			if (question == ans) {
				System.out.println("정답입니다");
				break;
			}

		}
		System.out.println(cnt + "번 시행됨");

	}

	public void question2() {
		/*
		 * 논리연산자 : && || ! 을 이용할 것 4의 배수 윤년 1992 1996 2004 100의 배수 평년 1700 1800 1900
		 * 400의 배수 1600 2000 윤년
		 */
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		boolean four = year%4==0;
		boolean hund = year%100==0;
		boolean fhund = year%400==0;
		
		
		
		if ((four && !hund) || fhund) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}

	}
}
