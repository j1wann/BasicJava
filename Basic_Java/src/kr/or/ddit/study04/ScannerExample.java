package kr.or.ddit.study04;
import java.util.Scanner;
public class ScannerExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScannerExample obj = new ScannerExample();
		obj.method2();
	}
	
	public void method1() {
		System.out.println("메소드1");
	}
	public void method2() {
		System.out.println("국어점수 입력 : ");
		String kor_str = sc.nextLine();
		int kor = Integer.parseInt(kor_str);
		
		System.out.println("수학점수 입력 : ");
		String math_str = sc.nextLine();
		int math = Integer.parseInt(math_str);
		
		System.out.println("영어점수 입력 : ");
		String eng_str = sc.nextLine();
		int eng = Integer.parseInt(eng_str);
		
		int sum = kor+math+eng;
		double avg = (double)sum/3;
		
		System.out.println("국어점수 : "+kor+"\t수학점수 : "+math+"\t영어점수 : "+eng+"\t총합 : "+ sum+"\t평균 : "+ avg);
	}
}
