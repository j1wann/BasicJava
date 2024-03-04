package kr.or.ddit.homework;
import java.util.Scanner;
public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}
	public void method1() {
		/*
		 * 구구단 출력
		 * 스캐너를 통해 입력받은 단의 구구단 출력
		 */
		int input = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(input+"*"+i+"="+(input*i));
		}
	}
	public void method2() {
		/*
		 * 구구단 전체 출력
		 * 2*1 = 2	3*1 = 3	.... 9*1=9
		 * 2*2 = 4	....		9*2=18
		 * .......
		 * 2*9=18....			9*9=81 
		 */
		
		for(int i = 1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	public void method3() {
		/*
		 * 입력받은 단 제외하고 전체 출력
		 * ex) 4
		 */
		int input = sc.nextInt();
		for(int i = 1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				if(j==4)
					continue;
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	public void method4() {
		/*
		 * 스캐너를 통해서 숫자 입력
		 * 홀수일 때
		 * ex) 11 : 1~11까지 홀수 합
		 * 짝수일 때
		 * ex) 8 : 2*2 + 4*4 + 6*6 + 8*8
		 */
		int i1 = sc.nextInt();
		int sum = 0;
		System.out.print(i1+" : ");
		
		if(i1%2==0) {
			for(int i = 2; i <=i1; i+=2) {
				System.out.print(i+"*"+i);
				sum += i1*i1;
				if(i!=i1)
					System.out.print(" + ");
			}
		}//짝수일 경우
		else {
			for(int i = 1; i <=i1; i+=2) {
				System.out.print(i);
				sum +=i;
				if(i!=i1)
					System.out.print(" + ");
				}
		}//홀수일 경우
		System.out.println("\n"+sum);
	}
}
