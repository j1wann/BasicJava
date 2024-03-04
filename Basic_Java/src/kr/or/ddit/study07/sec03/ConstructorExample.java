package kr.or.ddit.study07.sec03;

public class ConstructorExample {
	public static void main(String[] args) {
		Constructor02 c1 = new Constructor02();
		Constructor02 c2 = new Constructor02("a test");
		Constructor02 c3 = new Constructor02("a test", "b test");
		System.out.println(c3);
	}
}
