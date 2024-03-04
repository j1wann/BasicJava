package kr.or.ddit.homework.home16;
import java.util.Scanner;
import java.util.Random;
public class C implements Nation2{
	@Override
	public int tax(int money) {
		// TODO Auto-generated method stub
		System.out.print("!세금 및 생활비 계산! 현재잔액 : " + money);
		money *= 0.8;
		money -= 3000;
		System.out.print(" 계산 후 잔액 : " + money+"\n");
		return money;
	}
	@Override
	public void game(int money) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("홀짝게임");
		System.out.println("1. 홀수\n2. 짝수");
		int select = sc.nextInt();
		int randnum = new Random().nextInt(2) + 1;
		if(randnum %2 == 0) {
			if(select == 1) {
				System.out.println("패배");
			}
			else {
				System.out.println("승리");
				money += 15000;
				System.out.println("보유 잔액 : " + money);
			}
		}
		else {
			if(select == 1) {
				System.out.println("승리");
				money += 15000;
				System.out.println("보유 잔액 : " + money);
			}
			else {
				System.out.println("패배");
			}
		}
	}
}
