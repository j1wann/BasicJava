package kr.or.ddit.study11;

import java.io.File;
import java.util.Scanner;

public class StringLang {
	public static void main(String[] args) {
		StringLang obj = new StringLang();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("계속 하시겠습니까?(y/n)");
			
			String yn = sc.next();
			if (yn.equalsIgnoreCase("n"))
				break;
		}
	}

	public void method6() {
		String test = "test1, " + "test2, " + "test3, " + "test4, " + "test5";

		String[] tokens = test.split(",");

		for (String string : tokens) {
			System.out.println(string.trim());
		}
	}

	public void method5() {
		String test = "가나다라마바보";
		System.out.println(test);
		test = test.replace("바보", "**");
		System.out.println(test);
		test = "  test  test  test  ";
		test = test.trim();
		test = test.replace("  ", ",");
		System.out.println(test);

	}

	public void method4() {
		String test = "   test		";
		System.out.println(test);
		System.out.println("=================");
		test = test.trim();
		System.out.println(test);
	}

	public void method3() {
		String test = "소문자 abcd";
		System.out.println(test);

		test = test.toUpperCase();
		System.out.println(test);

		if (test.contains("ABCD")) {
			System.out.println("포함됨");
		}

		test = test.toLowerCase();
	}

	public void method2() {
//		String test = "문자열 test 입니다.";
//		String start = "문자열";
//		if(test.startsWith(start)) {
//			System.out.println(start+"로 시작합니다");
//		}
//		String end = "입니다.";
//		if(test.endsWith(end)) {
//			System.out.println(end+"로 끝납니다.");
//		}

		File dir = new File("원하는 파일 경로");

		for (String name : dir.list()) {
			if (!name.startsWith("2024"))
				continue;

			if (name.endsWith(".xls") || name.endsWith(".xlsx")) {
				System.out.println(name);
			}
		}

	}

	public void method1() {
		String test = "문자열 test 입니다";
		String search = "test";

		if (test.contains(search)) {
			System.out.println(search + " 값이 포함되어있음");
		}

	}
}
