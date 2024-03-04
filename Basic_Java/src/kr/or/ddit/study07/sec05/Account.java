package kr.or.ddit.study07.sec05;

public class Account {
	int money = 10000;
	
	private static Account instance = null;

	private Account() {

	}

	public static Account getInstance() {

		if (instance == null) {
			instance = new Account();
		}
		return instance;
	}
	
	public void getMoney(int num) {
		if(num > money) {
			System.out.println("잔고가 모자릅니다");
			System.out.println("잔고 : "+money);
			return;
		}
		money -= num;
		System.out.println(num + "출금되었습니다.");
		System.out.println("잔고 : "+money);
	}
}
