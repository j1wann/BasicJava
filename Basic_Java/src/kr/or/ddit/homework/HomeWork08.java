package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	public void process() {
		// 5명의 3과목 성적과 이름을 배열에 저장하고
		// 총점, 평균, 등수를 구하여 출력하시오.

		String[] stuName = {"미연", "민니", "소연", "우기", "슈화"};
		int[][] scores = { { 80, 70, 80, 0, 0, 1 },
						   { 90, 85, 90, 0, 0, 1 },
						   { 90, 70, 75, 0, 0, 1 },
						   { 65, 75, 70, 0, 0, 1 },
						   { 80, 80, 70, 0, 0, 1 } };
		//1. 총점 구하기
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < 3; j++) {
				sum += scores[i][j];
			}
			scores[i][3] = sum;
			//2. 평균 구하기
			scores[i][4] = sum/3;			
		}
		
		
		//등수구하기 답
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j <scores.length; j++) {
				if(scores[i][3] < scores[j][3]) {
					scores[i][5]++;
				}
			}
		}
		// 정렬 답
		for(int i = 0; i < scores.length-1; i++) {
			for(int j = 0; j < scores.length-1; j++) {
				if(scores[j][3] < scores[j+1][3]) {
					int[] temp = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = temp;
					
					String sTemp = stuName[j];
					stuName[j] = stuName[j+1];
					stuName[j+1] = sTemp;
				}
			}
		}
		
		
		
//		//3. 정렬하기
//		String temp = "";
//		int[] tmp = new int[6];
//		//min 찾아내기 > min 제외하고 등수 +1 
//		//등수 2인 사람 중 min 찾기 , 반복
//		for(int i = 0; i < scores.length-1; i++) {
//			for(int j = 0; j<scores.length-1; j++) {
//				if(scores[j][3] < scores[j+1][3]) {
//					//총점 기준으로 정렬
//					tmp = scores[j];
//					scores[j] = scores[j+1];
//					scores[j+1] = tmp;
//
//					//이름 순서 바꿈
//					temp = stuName[j];
//					stuName[j] = stuName[j+1];
//					stuName[j+1] = temp;
//				}
//			}
//		}
//		
//		//4. 출력하기
//		System.out.println("총점 순으로 정렬");
//		System.out.println("======================================================");
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
//		System.out.println("======================================================");
//		for(int i = 0; i < scores.length; i++) {
//			System.out.print(stuName[i] + "\t");
//			for(int j = 0; j < scores[i].length; j++) {
//				System.out.print(scores[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		//5. 등수구하기
//		System.out.println("\n등수 매기기");
//		int rank = 0;
//		for(int i = 0; i < scores.length -1 ; i++) {
//			if(scores[i][3] == scores[i+1][3])
//				scores[i+1][5] += rank;
//			else {
//				rank++;
//				scores[i+1][5] += rank;
//			}
//		}
		
		//6. 출력하기
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(stuName[i] + "\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
