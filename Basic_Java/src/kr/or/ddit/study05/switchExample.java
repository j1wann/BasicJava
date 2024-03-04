package kr.or.ddit.study05;

import java.util.Scanner;

public class switchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		switchExample obj = new switchExample();
//      obj.method1();
//		obj.method2();
		obj.method3();
	}

	public void method1() {
		System.out.println("회원 등급 코드 (1-3) : ");
		int grade = sc.nextInt();

		switch (grade) {
		case 1:
			System.out.println("VIP회원입니다.");
			break;
		case 2:
			System.out.println("우수 회원입니다.");
			break;
		case 3:
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("잘못된 등급입니다.");
			break;
		}
	}

	public void method2() {
		/*
		 * 국가 영문 약자를 입력 받고 국가명을 출력 kor -> 한국 jpn -> 일본 chn -> 중국
		 */
		System.out.println("나라를 입력하세요 : ");
		String con = sc.nextLine();
		switch (con) {
		case "kor":
			System.out.println("한국");
			break;
		case "jpn":
			System.out.println("일본");
			break;
		case "chn":
			System.out.println("중국");
			break;
		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
	}

	public void method3() {
		// 각 달 입력 끝자리 출력
		// 1 3 5 7 8 10 12 : 31일
		// 4 6 9 11 : 30
		// 2 : 28, 29
		System.out.print("달 입력 : ");
		int input = sc.nextInt();

		switch (input) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("끝자리 30");
			break;
		case 2:
			System.out.println("끝자리 28 or 29");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("끝자리 31일");
			break;
		default:
			break;
		}
	}

}