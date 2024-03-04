package kr.or.ddit.study07.sec04;

import java.io.File;
import java.util.Date;

public class MethodTest06 {
	public static void main(String[] args) {
		MethodTest06 mt = new MethodTest06();
		mt.process();
	}
	public void process() {
		Date d1 = new Date();
		
		System.out.println(fibo(7));
		Date d2 = new Date();
		
		System.out.println(d2.getTime() - d1.getTime() + "ms");
		
	}
	// 피보나치 수열 구하기
	
	long[] fiboResult = new long[10000];
	
	public long fibo(int n) {
		//1+1+2+3+5+8+13
//		if(n <= 2) return 1;
//		
		if(n ==1) {
			return 1;
		}
		if(n < 1) {
			return 0;
		}
		return fibo(n-1) + fibo(n-2);
		
//		long f1 = fiboResult[n-1];
//		long f2 = fiboResult[n-2];
//		
//		if(f1 == 0) {
//			f1 = fibo(n-1);
//			fiboResult[n-1] = f1;
//		}
//		if(f2 == 0) {
//			f2 = fibo(n-2);
//			fiboResult[n-2] = f2;
//		}
//		 
//		return f1 + f2;
	}
	
	public int method1(int num) {
		// 1*2*3*...*10
//		int result = 1;
//		for(int i = 1; i <= 10; i ++) {
//			result *= i;
//		}
		
		if(num==1) return 1;
		
		return num*method1(num-1);
	}
	
	public long sum(int num) {
		
		if(num == 1) return 1;
		return num + sum(num-1);
	}
	
//	public void findFile(File file) {
//		if(file.isDirectory()) {
//			findFile(file);
//		}else {
//			System.out.println(file);
//		}
//	}
}
