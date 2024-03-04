package kr.or.ddit.homework.home16;
import java.util.Scanner;
import java.util.Random;

public class B implements Nation2{
	@Override
	public int tax(int money) {
		// TODO Auto-generated method stub
		System.out.print("!세금 및 생활비 계산! 현재잔액 : " + money);
		money *= 0.85;
		money -= 2000;
		System.out.print(" 계산 후 잔액 : " + money +"\n");
		return money;
	}
	@Override
	public void game(int money) {
		// TODO Auto-generated method stub
		System.out.println("가위바위보 게임 (1, 2, 3 중에 하나 입력)");
		System.out.println("1. 가위\n2. 바위\n3. 보");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		int randnum = new Random().nextInt(3) + 1;
		
		System.out.print("나 : ");
		if(select == 1)
			System.out.println("가위");
		if(select == 2)
			System.out.println("바위");
		if(select == 3)
			System.out.println("보");
		System.out.print("컴퓨터 : ");
		if(randnum == 1)
			System.out.println("가위");
		if(randnum == 2)
			System.out.println("바위");
		if(randnum == 3)
			System.out.println("보");
		
		boolean res = false;
		if(select == 1) {
			if(randnum == 1) System.out.println("비겼다");
			if(randnum == 2) System.out.println("졌다");
			if(randnum == 3) {
				System.out.println("이겼다");
				res = true;
			}
		}
		else if(select == 2){
			if(randnum == 1) {
				System.out.println("이겼다");
				res = true;
			}
			if(randnum == 2) System.out.println("비겼다");
			if(randnum == 3) System.out.println("졌다");
		}
		else {
			if(randnum == 1) System.out.println("졌다");
			if(randnum == 2) {
				System.out.println("이겼다");
				res = true;
			}
			if(randnum == 3) System.out.println("비겼다");
		}
		if(res) {
			System.out.println("20000원 지급");
			money+=20000;
			System.out.println("현재 보유금액 : " + money);
		}
	}
}
