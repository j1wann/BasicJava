package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
		// 정수형
		// 1) byte : 1byte(127 ~ -128)
		// 2) short : 2byte(32767 ~ -32768)
		// 3) int : 4byte(2147483647 ~ -2147483648) 자바의 기본 정수형
		// 4) long : 8byte(2^63-1 ~ -2^63) 데이터 끝에 L(l)을 추가
		// byte b1 = 128; > 버그남
		short s1 = 100;
		//System.out.println("s1=" + s1);
		short s2 = (short)(s1+100); 
		short s3 = 200;
		
		int var1 = 200;
		int var2 = 0200;
		int var3 = 0x200;
		int var4 = 0b1100;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		long l1 = 10000000000l; // int 범위 밖의 크기라면 뒤에 l 붙여야함
		
	}
}
