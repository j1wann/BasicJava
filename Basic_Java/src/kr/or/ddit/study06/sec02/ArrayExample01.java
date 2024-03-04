package kr.or.ddit.study06.sec02;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
		obj.method8();
//		obj.method9();
	}
	
	public void method9() {
		//선택정렬
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i<num.length-1; i++) {
			int minIndex = i;
			for(int j = i; j<num.length; j++) {
				if(num[j] < num[minIndex]) {
					minIndex = j;
				}
			}
			int temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;
		}
		System.out.println(Arrays.toString(num));
	}
	public void method8() {
		//향상된 버블정렬
		//원본 자료가 n개일 때 n-1차 운행한다.
		//각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		//작은 값을 뒤에 위치시킴
		//버블 정렬이 완료되면 반복문을 종료시킨다.
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < num.length-1; i++) {
			boolean flag = true;
			for(int j = 0; j<num.length-1; j++) {
				if(num[j] < num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = false;
				}
			}
			if(flag) break;
			System.out.println(Arrays.toString(num));
		}
	}
	public void method7() {
		//버블 정렬
		// 원본 자료가 n개일 때 n-1차 운행한다.
		// 각 회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은 값을 앞에 위치시킴
		
		int[] num = {67, 55, 9, 86, 98};
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < num.length-1; i++) {
			for(int j = 0; j<num.length-1; j++) {
				if(num[j] < num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					
//					System.out.println();
				}
				System.out.println(Arrays.toString(num));
			}
		}
		
		System.out.println(Arrays.toString(num));
	}
	
	public void method1() {
		/*
		 * int 점수 5개 입력 후 총점, 평균 계산
		 */
		int[] score;
		int sum = 0;
		score = new int[5];
		for(int i = 0; i<5; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println("총점 : "+sum + " 평균 : " + sum/5);
		
	}
	public void method2() {
		//정수 5개 입력, 출력
		int[] score;
		int sum = 0;
		score = new int[5];
		for(int i = 0; i<score.length; i++) {
			score[i] = sc.nextInt();
			System.out.println("입력한 정수: " + score[i]);
		}
		
	}
	public void method3() {
		int[] score = { 75, 80, 81, 84, 95};
		//최대값, 최소값 구하기
		int max = 0;
		int min = score[0];
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max)
				max = score[i];
				
			if(score[i] < min)
				min = score[i];
		}
		System.out.println("최댓값은 "+max+", 최솟값은 " + min);
	}
	public void method4() {
		//키보드로 금액을 입력받고 알맞은 금액을 거슬러 주세요
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10};
		System.out.print("금액 입력 : ");
		int price = sc.nextInt();
		
		for(int i = 0; i < coin.length; i++) {
			if(price > coin[i]) {
				System.out.print(coin[i]+"*"+price/(coin[i]));
				price -= coin[i]*(price/(coin[i]));
			}
			
		}
		
		//ex) 55400 -> 10000*5 + 5000*1 + 100*4
	}
	public void method5() {
		//배열 복사 : 얕은 복사(shallow copy), 깊은 복사
		//1. 얕은 복사
		//	 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 같이 변경
		int[] source = {1, 2, 3, 4, 5};
		int[] target = source;
		
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target));
		target[2] = 10;
		
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target));
		
		
	}
	public void method6() {
		//2. 깊은 복사
		//	 배열 공간을 별도로 확보
		//	 a. 반복문 이용
		//	 b. System.arraycopy();
		//	 c. clone();
		
		int[] source = {1, 2, 3, 4, 5};
		//a. 반복문 이용
		int[] target1 = new int[source.length];
		
		for(int i = 0; i<source.length; i++) {
			target1[i] = source[i];
		}
//		System.out.println("변경 전");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target1));
//		
//		target1[2] = 10;
//		System.out.println("변경 후");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target1));
		//b. System.arraycopy();
//		int[] target2 = new int[source.length];
//		System.arraycopy(source, 2, target2, 1, 3);
//		System.out.println(Arrays.toString(target2));
		//c. clone()
		int[] target3 = source.clone();
		System.out.println(Arrays.toString(target3));
	}
	
	
}
