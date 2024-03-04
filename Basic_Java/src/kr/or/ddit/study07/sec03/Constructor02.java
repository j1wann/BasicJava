package kr.or.ddit.study07.sec03;

public class Constructor02 {
	
	String a;
	String b;
	
	public Constructor02() {
		this("a");
	}

	public Constructor02(String a) {
		this(a, "b");
	}

	public Constructor02(String a, String b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Constructor02 [a=" + a + ", b=" + b + "]";
	}
	
}
