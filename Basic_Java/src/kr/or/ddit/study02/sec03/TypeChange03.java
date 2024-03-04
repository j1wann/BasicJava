package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class TypeChange03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TypeChange03 obj = new TypeChange03();
		obj.method2();
	}

	public void method1() {
		// 8개 기본타입
		// byte, char, short, int, long, float, double, boolean
		byte b1 = 10, b2;
		char c1 = 'A', c2;
		short s1 = 100, s2;
		int i1 = 1000, i2;
		long l1 = 10000, l2;
		float f1 = 20, f2;
		double d1 = 200, d2;
		boolean B1 = true;
	}

	public void method2() {
		byte b1 = 10;
		char c1 = 'A';
		short s1 = 100;
		int i1 = 1000;
		long l1 = 10000;
		float f1 = 20;
		double d1 = 200;
		boolean B1 = true;
		// 1. int > long
		long l2 = i1;
		// 2. long > int
		int i2 = (int) l1;
		// 3. char > int
		i2 = c1;
		// 4. int > char
		char c2 = (char) i1;
		// 5. int > double
		double d2 = i1;
		// 6. double > int
		i2 = (int) d1;
		// 7. int > string
		String str1 = "" + i2;
		// 8. string > int
		i2 = Integer.parseInt(str1);
		// 9. char > string
		char c3 = 'A';
		String str2 = "" + c3;
		// 10. string > char
		String s3 = "abcd";
		char c4 = s3.charAt(2);
		System.out.println("s3 > c4 : " + s3 + ", " + c4);
	}
}
