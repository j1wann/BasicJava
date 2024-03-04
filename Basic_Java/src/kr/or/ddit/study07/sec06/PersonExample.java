package kr.or.ddit.study07.sec06;

import java.util.Scanner;

public class PersonExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();

		p1.setAge(-1);
		p1.setGender("남");
		p1.setName("홍길동");
		System.out.println(p1);

//		Person p2 = new Person();
//		p2.name = "홍길동2";
//		p2.gender = "남";
//		Person p3 = new Person();
//		p3.name = "홍길동3";
//		p3.gender = "남";
	}
}
