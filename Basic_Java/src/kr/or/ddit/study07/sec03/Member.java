package kr.or.ddit.study07.sec03;

public class Member {
	String nation;
	String group;
	String name;
	int age;

	//국가 그룹 이름 나이 입력
	//그룹 이름 나이 < 국가 기본값 한국
	//이름 나이 < 기본값 304
	public Member(String nation, String group, String name, int age) {
		this.nation = nation;
		this.group = group;
		this.name = name;
		this.age = age;
		
	}
	public Member(String group, String name, int age) {
		this("한국", group, name, age);
	}
	public Member(String name, int age) {
		this("304", name, age);
	}
	@Override
	public String toString() {
		return "Member [nation=" + nation + ", group=" + group + ", name=" + name + ", age=" + age + "]";
	}

}