package kr.or.ddit.study03;
import java.util.Scanner;
public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		//obj.method1();
		//obj.method3();
		//obj.method4();
		obj.method5();
	}
	public void method1() {
		// 논리 연산자.
		// A && B : and 연산
		// A||B : or 연산
		// ! : NOT 연산
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(a&&!b);
		
	}
	public void method3() {
		//논리 연산자
		// &, |
		int a = 45;
		int b = 25;
		System.out.println(a&b);
		System.out.println(a|b);
		
	}
	public void method4() {
		// 시프트 연산자
		// << >>, 숫자 >> 정수 : 숫자를 정수만큼 오른쪽으로 평행이동
		// 숫자를 2^정수로 나눈 몫이 됨
		System.out.println(12>>2);
		System.out.println(12<<2);
	}
	public void method5() {
		//대입 연산자
		//=, 오른쪽 값을 왼쪽에 저장. 우선순위가 가장 낮다
		int a = 10;
		int b = 4;
		System.out.println("a=a+b => a+=b =>"+ (a+=b));
		System.out.println("a=a-b => a-=b =>"+ (a-=b));
		System.out.println("a=a*b => a*=b =>"+ (a*=b));
		System.out.println("a=a/b => a/=b =>"+ (a/=b));
		System.out.println("a=a%b => a%=b =>"+ (a%=b));
	}
}
