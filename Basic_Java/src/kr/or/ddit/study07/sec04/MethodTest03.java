package kr.or.ddit.study07.sec04;

public class MethodTest03 {
	public static void main(String[] args) {
		// a + b 메소드를 만들고 결과를 메인에 받아서 출력
		// a - b 메소드를 만들고 결과를 메인에 받아서 출력
		// a / b 메소드를 만들고 결과를 메인에 받아서 출력
		// a * b 메소드를 만들고 결과를 메인에 받아서 출력
		MethodTest03 mt = new MethodTest03();
		System.out.println(mt.method1(5, 2));
		System.out.println(mt.method2(5, 2));
		System.out.println(mt.method3(5, 2));
		System.out.println(mt.method4(5, 2));
	}
	public int method1(int a, int b) {
		return a+b;
	}
	public int method2(int a, int b) {
		return a-b;
	}
	public double method3(int a, int b) {
		return a/b;
	}
	public int method4(int a, int b) {
		return a*b;
	}
}
