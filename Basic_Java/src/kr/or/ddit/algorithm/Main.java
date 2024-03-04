package kr.or.ddit.algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main obj = new Main();
		obj.method1();
	}
	public void method1() {
		//100x100 인 2차원 배열
		int[][] paper = new int[100][100];
		int paperNum = sc.nextInt();
		int result = 0;
		for(int i = 0; i < paperNum; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j = a; j < a+10; j++) {
				for(int k = b; k < b+10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				result += paper[i][j];
			}
		}
		System.out.println(result);
		
		
	}
	
}

