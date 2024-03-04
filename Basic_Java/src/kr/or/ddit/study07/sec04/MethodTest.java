package kr.or.ddit.study07.sec04;

public class MethodTest {
	public static void main(String[] args) {
		System.out.println("메인 메소드");
		
		MethodTest mt = new MethodTest();
		mt.method1();
		int res1 = mt.method2();
		System.out.println("메인에서 받은 리턴값 : "+res1);
		double res2 = mt.method3();
		System.out.println("메인에서 받은 리턴값 : "+res2);
		
	}
	public void method1() {
		System.out.println("public void method1()");
		System.out.println("리턴값 X");
	}
	public int method2() {
		System.out.println("public int method2()");
		System.out.println("리턴값 int");
		return 10;
	}
	public double method3() {
		System.out.println("public double method2()");
		System.out.println("리턴값 double");
		return 10.5;
	}
}