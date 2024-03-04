package kr.or.ddit.study05;

import java.util.Scanner;

public class ForExample00 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample00 obj = new ForExample00();
		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
	}
	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		int row = sc.nextInt();
		for( row =0; row<4; row++) {
			for(int space = 0; space < 4-row-1; space++) {
				System.out.print(" ");
			}
			for(int star = 0; star < row+1; star++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		for(int row = 0; row<4; row++) {
			for(int space = 0; space < row; space++) {
				System.out.print(" ");
			}
			for(int star = 0; star< 4-row;star++)
				System.out.print("*");
			System.out.println();
		}
	}
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 *     입력받은 수 row가 5일 때
		 *     star + space = row
		 *     space = row - star
		 *     앞, 뒤 공백 = (row - star)/2
		 */
		int row = sc.nextInt();
		for(i=0; i<row; i++) {
			for()
		}
		
	}
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
	}
	
}
