package kr.or.ddit.study05;
import java.util.Scanner;
public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
		obj.method4();
	}
	public void method1() {
		//모음 수 출력
		// a e i o u
		// ex ) length : 1개
		String input = sc.next();
		int cnt = 0;
		int length = input.length();
		for(int i = 0; i < length; i++) {
			char c = input.charAt(i);
			if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ) {
				cnt++;
			}
		}
		System.out.println(input+", 개수 : "+ cnt);
	}
	public void method2() {
		/*
		 * 구구단 출력해보기
		 */
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+"X"+j+"="+i*j+"\t");
			}
		System.out.println();
		}
	}
	public void method4() {
		//스캐너를 통해 입력한 숫자까지 출력하고 for문을 종료
		int j = sc.nextInt();
		for(int i = 0; i < 1000; i++) {
			System.out.print(i+" ");
			if(i == j)
				break;
		}
	}
}
