package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		}

	public void method1() {
		/*
		 * 스캐너를 통해 숫자를 입력받고 소수점 2째 자리에서 버림 ex) 12.23123 -> 12.23
		 */
		System.out.print("실수를 입력해주세요 : ");
		String str1 = sc.nextLine();
		double d1 = Double.parseDouble(str1);
		int i1 = (int) (d1 * 100);
		d1 = (double) i1 / 100;
		System.out.println(d1);
	}

	public void method2() {
		/*
		 * 스캐너를 통해 소문자를 입력받고 대문자로 변환 ex) a > A
		 */
		System.out.print("소문자 입력 : ");
		String str1 = sc.nextLine();
		int c1 = str1.charAt(0) - 32;
		System.out.println((char) c1);

	}

	public void method3() {
		/*
		 * 대문자 > 소문자 전환
		 */
		System.out.print("대문자 입력 : ");
		String str1 = sc.nextLine();
		int c1 = str1.charAt(0) + 32;
		System.out.println((char) c1);
	}

	public void method4() {
		/*
		 * 스캐너를 통해 숫자 3자리를 입력받고 각 자리수 합을 구하시오 ex) 123 > 1 + 2 + 3 = 6
		 */
		System.out.print("숫자 세자리 입력 : ");
		String str1 = sc.nextLine();
		int a = Integer.parseInt(str1)/100;
		int b = (Integer.parseInt(str1)-a*100)/10;	
		int c = (Integer.parseInt(str1)-(a*100+b*10));
		System.out.println(a+b+c);
	}

	public void method5() {
		/*
		 * 스캐너를 통해서 숫자를 입력받고 소수점 2째자리에서 반올림 ex) 12.2623 -> 12.3
		 */
		System.out.print("실수를 입력해주세요 : ");
		String str1 = sc.nextLine();
		//12.26 > 0.6, 0.6*2 >1.2, 정수화, /10 > 0.1, 더하기
		double d1 = Double.parseDouble(str1);
		int i1 = (int)(d1*100);
		int i2 = (int)(d1*10);
		double d2 = (double)i1/100-(double)i2/10;
		int i3 = (int)((d1+d2)*10);
		System.out.println((double)i3/10);
		
	}
	
}
