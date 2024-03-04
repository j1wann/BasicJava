package kr.or.ddit.study06.sec03;

public class Calculator {
	// 더하기 빼기 곱하기 나누기 메소드 만들기
	public double cal(int a, CalType type, int b) {

		if (type == CalType.ADD)
			return sum(a, b);
		else if (type == CalType.SUB)
			return sub(a, b);
		else if (type == CalType.MUL)
			return mult(a, b);
		else if (type == CalType.DIV)
			return div(a, b);
		else if (type == CalType.PER)
			return div(a, b);
		else {
			System.out.println("지원하지 않는 연산자.");
			return 0;
		}

	}

	private int sum(int a, int b) {

		return a + b;
	}

	private int sub(int a, int b) {

		return a - b;
	}

	private int mult(int a, int b) {

		return a * b;
	}

	public double div(int a, int b) {

		return (double) a / b;
	}

	public double per(int a, int b) {

		return (double) a % b;
	}
}
