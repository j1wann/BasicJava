package kr.or.ddit.study07.sec05;

public class StaticTest {
	static int a;
	int b;
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
	}
	
	static void method1() {
		System.out.println(a);
		StaticTest st1 = new StaticTest();
		System.out.println(st1.b);
	}
	void method2() {
		System.out.println(a);
		System.out.println(b);
	}
}
