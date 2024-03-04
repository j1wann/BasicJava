package kr.or.ddit.study06.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
//      obj.method1();
//      obj.method2();
//      obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	public void method6() {
		int[] array = {1, 3, 5, 2, 4};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
	public void method5() {
		//1차원 배열 건너 뛰기
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[5];
		arr[2] = new int[5];
	}

	public void method4() {
		int k = 1;
		int[][] numList = new int[5][5];
//	   for(int i = 0; i < numList.length; i++) {
//		   for(int j = 0; j < numList.length; j++)
//			   numList[i][j] = k+5*j;
//		   k++;
//	   }

//		for (int i = 0; i < numList.length; i++) {
//			for (int j = 0; j < numList.length; j++)
//				if (i % 2 == 0)
//					numList[i][j] = k++;
//				else
//					numList[i][numList[i].length - j - 1] = k++;
//		}
		
		

		for (int i = 0; i < numList.length; i++) {
			for (int j = 0; j < numList[i].length; j++)
				System.out.print(numList[i][j] + "\t");
			System.out.println();
		}

	}

	public void method1() {
		int[][] arr = new int[3][3];

		int[] sub1 = new int[3];
		int[] sub2 = new int[3];
		int[] sub3 = new int[3];

		arr[0] = sub1;
		arr[1] = sub2;
		arr[2] = sub3;
	}

	public void method2() {
		/*
		 * 5명의 국어 영어 수학 점수 만들기 1차원 배열 5개 만들기
		 */
		int[] num1 = { 100, 97, 84 };
		int[] num2 = { 80, 57, 74 };
		int[] num3 = { 100, 97, 94 };
		int[] num4 = { 60, 57, 94 };
		int[] num5 = { 80, 47, 98 };

		int[][] numList = new int[5][3];
		numList[0] = num1;
		numList[1] = num2;
		numList[2] = num3;
		numList[3] = num4;
		numList[4] = num5;

		// 1번 학생의 국어점수 출력
		int firstkor = numList[0][0];
		System.out.println("1번학생의 국어 점수 : " + firstkor);

		// 2번 학생에 수학점수 출력
		int secondmath = numList[1][2];
		System.out.println("2번학생의 수학 점수 : " + secondmath);

		// 3번 학생에 영어점수 출력
		int eng3 = numList[2][1];
		System.out.println("3번학생의 영어 점수 : " + eng3);

		// 4번학생에 총점 구하기
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < numList[3].length; i++) {
			sum += numList[3][i];
			avg = (double) sum / 3;
		}
		System.out.println("4번학생의 총점 : " + sum + "평균 : " + avg);

		// 5번학생에 총점 구하기
		int sum2 = 0;
		double avg1 = 0;
		for (int i = 0; i < numList[4].length; i++) {
			sum2 += numList[4][i];
			avg1 = (double) sum2 / 3;
		}
		System.out.println("4번학생의 총점 : " + sum2 + "평균 : " + avg1);

	}

	public void method3() {
		int[][] scorelist = { { 100, 97, 84 }, { 80, 57, 74 }, { 100, 97, 94 }, { 60, 57, 94 }, { 80, 47, 98 } };
		// 국어점수 총합 구하기
		int sum3 = 0;
		for (int i = 0; i < scorelist.length; i++) {
			sum3 += scorelist[i][0];
		}
		System.out.println(sum3);

		// 영어점수 총합구하기
		int sum4 = 0;
		for (int i = 0; i < scorelist.length; i++) {
			sum4 += scorelist[i][1];
		}
		System.out.println(sum4);

		// 각 사람별 평균 구하기
		for (int i = 0; i < scorelist.length; i++) {
			int sum5 = 0;
			double avg3 = 0;
			for (int j = 0; j < scorelist[i].length; j++) {
				sum5 += scorelist[i][j];
				avg3 = sum5 / 3;
			}
			System.out.println(sum5 + "," + avg3);
		}

	}

}