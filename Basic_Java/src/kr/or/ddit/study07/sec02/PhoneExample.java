package kr.or.ddit.study07.sec02;

public class PhoneExample {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		
		p1.name = "아이폰";
		p1.year = 2022;
		p1.camera = "1억화소";
		
		p2.name = "갤럭시";
		p2.year = 2023;
		p2.camera = "1억화소";
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
