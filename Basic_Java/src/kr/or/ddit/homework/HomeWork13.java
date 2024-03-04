package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork13 {
	public static void main(String[] args) {
		Reserve test = Reserve.getInstance();
		test.reservation();
		test.reservation();
	}
}

class Reserve {
	Person person = null;
	Scanner sc = new Scanner(System.in);
	int input = 0;
	private static Reserve instance = null;

	private Reserve() {

	}

	public static Reserve getInstance() {

		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}

	public void reservation() {
		// 사람이 있다면 예약이 안됨
		// 동시에 예약된 사람 정보 출력
		while (true) {
			System.out.println("=====예약 시스템=====");
			System.out.println("1. 예약");
			System.out.println("2. 완료");
			System.out.println("3. 종료");
			input = sc.nextInt();

			if (input == 1) {
				if (person != null) {
					System.out.println("예약자가 이미 존재합니다");
					System.out.println("현재 예약자 : " + person.name);
				} else {
					System.out.println("성함을 입력해주세요");
					String name = sc.next();
					person = new Person(name);
					System.out.println("예약 완료.");
				}
			}
			else if (input ==2) {
				if(person == null) {
					System.out.println("예약이 없습니다");
				}
				else {
					out();
				}
			}
			else if (input == 3) {
				System.out.println("=====예약 시스템 종료=====");
				break;
			}
			else {
				System.out.println("잘못된 값을 입력하였습니다");
			}
		}
	}

	public void out() {
		// 예약된 사람이 이용종료하면 다시 예약 가능한 상태로 복귀
		System.out.println(person.name + "님 이용 종료");
		person = null;
	}
}

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}
}
