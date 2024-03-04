package kr.or.ddit.study06.sec01;
import java.util.Scanner;
public class ReferenceType00 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType00 obj = new ReferenceType00();
		obj.method1();
	}
	public void method1() {
		String str1 = "";
		String str2 = null;
		if(str1.equals(str2) || str1==null) {
			System.out.println("빈 문자열1");
		}
		
//		if(str2.equals(str1)|| str2==null) {
//			System.out.println("빈 문자열");
//		}
		
		if(str2 == null || str2.contentEquals("")) {
			System.out.println("빈 문자열");
		} //널 체크는 항상 앞쪽에

		
	}
}
