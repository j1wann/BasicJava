package kr.or.ddit.study07.sec04;

public class MethodTest5 {
	public static void main(String[] args) {
		MethodTest5 obj = new MethodTest5();
//		obj.method1();
		obj.method2(10);
		obj.method3();
	}
	public void method3() {
		
		return ;
	}
	public int method2(int num) {
		//홀수면 홀수의 합
		//짝수면 짝수의 합
		
		if(num % 2 == 0) {
			int sum = 0;
			for(int i = 2; i < num ; i +=2) sum += i;
			return sum;
		}
		else {
			int sum = 0;
			for(int i = 1; i < num; i += 2) sum += i;
			return sum;
		}
		
		
	}
	public boolean method1() {
		
		
		return true;
	}
}
