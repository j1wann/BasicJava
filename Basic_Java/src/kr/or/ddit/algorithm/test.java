package kr.or.ddit.algorithm;
import java.util.Scanner;
public class test {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		test Test = new test();
		Test.method();
		
	}
	public double method() {
		double result = 0;
		System.out.print("식 입력 : ");
		String input = sc.nextLine();
		//"-3*4 + 4.7 + 10";
		// 일 때 결과 출력하는거 짜보기
		//  
		// *, / : 계산 우선순위
		// +, - 기준으로 토큰으로 분리. 토큰 개수만큼 배열 생성
		//토큰 안에있는 숫자들 계산 후 계산된 값들 +, - 연산
		
		
		return result;
	}
}