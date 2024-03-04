package kr.or.ddit.study07.sec03;

public class Student {
	String name;
	String gender;
	String phone;
	
	public Student() {	//기본 생성자
		
	}
	public Student(String name, String gender, String phone) {
//		System.out.println(name);
//		System.out.println(gender);
//		System.out.println(phone);
		
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.phone);
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.phone);
	}
}
