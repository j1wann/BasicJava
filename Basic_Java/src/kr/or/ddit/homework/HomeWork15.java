package kr.or.ddit.homework;

import java.util.Scanner;
import java.util.Random;

public class HomeWork15 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork15 hw = new HomeWork15();
//		System.out.println(hw.throwTwoDice());
		hw.process();
	}

	int[] res = new int[11];

	public void process() {
		// 주사위 2개 던진 전체 값을 히스토그램으로 나타내기
		/*
		 * 2 : ** 
		 * 3 : **** 4 : ****** 5 : ******** 6 : ******** . . . 11 : **** 12 : **
		 * 
		 * 1
		 */

		System.out.print("시행할 횟수 입력 : ");
		int num = sc.nextInt();
		printHistoGram(num);
	}

	public int throwOneDice() {
		int first = new Random().nextInt(6) + 1;
		return first;
	}

	public int throwTwoDice() {
//		int second = new Random().nextInt(6)+1;
		return throwOneDice() + throwOneDice();
	}

	public void rollNum(int num) {
		// 시행횟수 n 리턴 값 완성
		for (int i = 0; i < num; i++) {
			int sum = throwTwoDice();
			if (sum == 2) {
				res[0]++;
			} else if (sum == 3) {
				res[1]++;
			} else if (sum == 4) {
				res[2]++;
			} else if (sum == 5) {
				res[3]++;
			} else if (sum == 6) {
				res[4]++;
			} else if (sum == 7) {
				res[5]++;
			} else if (sum == 8) {
				res[6]++;
			} else if (sum == 9) {
				res[7]++;
			} else if (sum == 10) {
				res[8]++;
			} else if (sum == 11) {
				res[9]++;
			} else {
				res[10]++;
			}
		}

	}
	/*
	public int[] rollNum(int num)	{
		int[] result = new int[13];
		for(int i = 0; i < num; i++)
			result[throwTwoDice()]++;
		return result;
	} 
	 */
	

	//
	public void printHistoGram(int num) {
		rollNum(num);
		int cnt = 2;
		for (int n : res) {
			System.out.print(cnt + " : ");
			for (int i = 0; i < 100*n/num; i++) {
				System.out.print("*");
			}
			cnt++;
			System.out.println();
		}

	}
}
