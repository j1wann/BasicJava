package kr.or.ddit.homework.home12;

public class Person {
	int money ;
	String name;
	
	public Person(int money, String name) {
		this.money = money;
		this.name = name;
	}

	@Override
	public String toString() {
		return "추첨 시작 [현재 잔금=" + money + ", 하는 사람=" + name + "]";
	}
	
}
