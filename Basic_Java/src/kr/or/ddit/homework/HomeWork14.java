package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork14 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork14 hw = new HomeWork14();
		hw.process();
	}

	Mem[] memList = new Mem[100];
	int cur = 0;

	public void process() {
		while (true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 전체 정보 출력");
			System.out.println("5. 종료");
			System.out.println("1 ~ 5 선택");
			int select = sc.nextInt();
			if (select == 1) {
				addMember();
			} else if (select == 2) {
				removeMember();
			} else if (select == 3) {
				updateMember();
			} else if (select == 4) {
				printListMember();
			} else if (select == 5) {
				System.out.println("****종료****");
				break;
			}
		}
	}

	public void addMember() {
		Mem mem = new Mem();
		// 정보 입력
		System.out.print("나이 ? :");
		int age = sc.nextInt();
		mem.setAge(age);
		System.out.print("ID ? :");
		String id = sc.next();
		mem.setId(id);
		System.out.print("이름 ? :");
		String name = sc.next();
		mem.setName(name);
		System.out.print("비밀번호 ? :");
		String pass = sc.next();
		mem.setPass(pass);

		memList[cur++] = mem;
		System.out.println("회원가입이 완료되었습니다.");
	}

	public void removeMember() {
		boolean res = false;
		for (int i = 0; i < cur; i++) {
			if (memList[i] != null)
				res = true;
		}
		if (res == false) {
			System.out.println();
			System.out.println("현재 등록된 회원이 없습니다.");
			return;
		}
		System.out.print("삭제할 회원번호를 입력하세요");
		printListMember();
		int removeNum = sc.nextInt();
		for (int i = removeNum; i <= cur; i++) {
			memList[i] = memList[i + 1];
		}
		System.out.println("삭제되었습니다");
		cur--;
		printListMember();
	}

	public void updateMember() {
		printListMember();
		System.out.println("수정할 회원 번호 입력");
		int num = sc.nextInt();

		System.out.print("새로운 아이디 입력 : ");
		String id = sc.next();
		System.out.print("새로운 비밀번호 입력 : ");
		String pass = sc.next();
		System.out.print("새로운 이름 입력 : ");
		String name = sc.next();
		System.out.print("새로운 나이 입력 : ");
		int age = sc.nextInt();

		memList[num].setId(id);
		memList[num].setAge(age);
		memList[num].setName(name);
		memList[num].setPass(pass);
		// 수정 적용
		String newid = memList[num].getId();
		String newpass = memList[num].getPass();
		String newname = memList[num].getName();
		int newage = memList[num].getAge();
		System.out.println("**********수정된 회원 정보**********\n" + "회원번호 : " + num + " ID : " + newid + " 비밀번호 : " + newpass
				+ " 이름 : " + newname + " 나이 : " + newage);
	}

	public void printListMember() {
		boolean res = false;
		for (int i = 0; i < cur; i++) {
			if (memList[i] != null)
				res = true;
		}
		if (res == false) {
			System.out.println();
			System.out.println("현재 등록된 회원이 없습니다.");
			return;
		}
		for (int i = 0; i < cur; i++) {
			Mem mem = memList[i];
			String id = mem.getId();
			String pass = mem.getPass();
			String name = mem.getName();
			int age = mem.getAge();
			System.out.println("**********회원 정보**********\n" + "회원번호 : " + i + " ID : " + id + " 비밀번호 : " + pass
						+ " 이름 : " + name + " 나이 : " + age);
		}
	}
}

class Mem {
	private String id;
	private String pass;
	private String name;
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * 생성자 사용 x
	 * 
	 * toString 사용 x (getter setter)
	 */

}