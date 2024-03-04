package kr.or.ddit.study04;
import java.util.Scanner;
public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
		//obj.method1();
		obj.method3();
	}
//	public void method1(){
//		System.out.println("홍길동");
//		System.out.println(" 34061");
//		System.out.println(" 대전시 중구 계룡로");
//		System.out.println();
//		
//		System.out.print("홍길동");
//		System.out.print(" 34061");
//		System.out.print(" 대전시 중구 계룡로");
//		System.out.println();
//	}
//	public void method2() {
//		//System.out.printf("형식 지정 문자열", 변수리스트); 
//		System.out.printf("숫자 : %d 입니다.\n", 1000);
//		System.out.printf("%8d 입니다.\n", 1000); //출력에 8칸 할당
//		System.out.printf("%-8d 입니다.\n", 1000); //왼쪽정렬
//		System.out.printf("%08d 입니다.\n", 1000);	//남은 공간에 0 채움
//	}
	public void method3() {
		System.out.print("이름 :");
		String name = sc.nextLine();
		
		System.out.print("나이 :");
		String age= sc.nextLine();
		
		System.out.printf("이름 : %s, 나이 : %s", name, age);
	}
}
