package kr.or.ddit.study07.sec06;

public class Person {
	//이름 나이 성별
	private String name;
	private String gender;	
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("입력할 수 없는 데이터");
			return;
		}
		this.age = age;
	}
}