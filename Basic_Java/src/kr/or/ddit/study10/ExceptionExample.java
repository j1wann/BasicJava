package kr.or.ddit.study10;

import java.util.Scanner;

public class ExceptionExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		ee.process();
	}
	
	public void process() {
		System.out.println("숫자만 입력하세요.");
		
		try {
			double num = sc.nextInt();
			System.out.println("입력된 결과: " + num);	
		} catch (IndexOutOfBoundsException e) {
			System.out.println("에러가 발생 숫자만 입력하세요.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("에러가 발생 숫자만 입력하세요.");
			e.printStackTrace();
		} finally {
			
		}
		System.out.println("프로그램이 완료 되었습니다.");
		
		
	}
}
