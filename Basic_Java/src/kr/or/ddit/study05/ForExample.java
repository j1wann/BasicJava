package kr.or.ddit.study05;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();

	}

	public void method1() {
		/*
		 * 반복문 for, while문
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public void method2() {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method3() {
		int sum = 0;
		for (int i = 11; i < 21; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method4() {
		int sum = 0;
		for (int i = 2; i < 11; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method5() {
		/*
		 * 1 ~ 100 홀수 합
		 */
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				sum += i;
		}
		System.out.println(sum);

	}
	public void method6() {
		// a ~ z  까지 출력해보기
//		for(int i = 'a'; i < 'z'+1; i++) {
//			System.out.println((char)i);
//		}
		//입력문자부터 ~ z까지
		String input = sc.next();
		char char1 = input.charAt(0);
		for(int i = char1; i < 'z'+1; i++)
			System.out.println((char)i);
		
	}

}