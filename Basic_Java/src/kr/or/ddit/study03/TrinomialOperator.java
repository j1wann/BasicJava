package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
//		obj.method1();
		obj.method2();

	}

	public void method1() {
		// 삼항연산자 : 3개의 피연산자를 필요로 하는 연산
		// 삼항연사자는 ? 앞의 조건식의 결과에 따라 콜론 앞뒤의 피 연산자가 선택 / 조건 연산식이라고도 함
		// 형식 : (조건식) ? (참일 때 실행) : (거짓일 때 실행);
//		String result = true ? "참" : "거짓";
//		System.out.println(result);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		String result = age >= 18 ? "성년" : "미성년";
		System.out.println(result);
	}

	public void method2() {
		// a, b 값 int 입력 > a값이 짝수면 a+b 홀수면 a*b
		System.out.print("a값 입력 :");
		int a = sc.nextInt();

		System.out.print("b값 입력 :");
		int b = sc.nextInt();

		int result = (a % 2 == 0) ? a + b : a * b;
		System.out.println(result);
	}
}
