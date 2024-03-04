package kr.or.ddit.study02.sec03;

public class TypeChange {
	public static void main(String[] args) {
		int a = 20;
		String str = new String("23");
		System.out.println(a + str);

		int b = 23;
		String str1 = "" + a + b;
		System.out.println(str1);
		str1 = a + b + "";
		System.out.println(str1);
	}
}
