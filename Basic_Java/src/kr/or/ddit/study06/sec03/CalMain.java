package kr.or.ddit.study06.sec03;

public class CalMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double result = cal.cal(3, CalType.PER, 4);
		
		System.out.println(result);
		}
	}