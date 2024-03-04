package kr.or.ddit.study03;
import java.util.Scanner;
public class UnaryOperator {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		obj.method1();
		obj.method2();
	}
	public void method1() {
		// 1. 부호 연산자
		int num = 100;
		int res = -num;
		System.out.println("num : "+num);
		System.out.println("res : "+res);
	}
	public void method2() {
		// 2. 증감 연산자
		// ++변수 : 다른 연산을 수행하기 전에 1 증가
		// 변수++ : 다른 연산을 수행한 후에 1 증가
		int val;
		int res;
		
		val = 10;
		res = val++;
		System.out.println(val+", "+res);
		
		val = 10;
		res = ++val;
		System.out.println(val+", "+res);
	}
}

