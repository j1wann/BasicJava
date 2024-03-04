package kr.or.ddit.homework.home16;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class A implements Nation2{
	@Override
	public int tax(int money) {
		// TODO Auto-generated method stub
		System.out.print("!세금 및 생활비 계산! 현재잔액 : " + money);
		money *= 0.9;
		money -= 1000;
		System.out.print(" 계산 후 잔액 : " + money + "\n");
		return money;
	}
	@Override
	public void game(int money) {
		// TODO Auto-generated method stub
		System.out.println("주사위 2개 숫자 맞추기 게임");
		System.out.println("숫자 2개를 선택해주세요");
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		for(int i=0; i < 2; i++) {
			num[i] = sc.nextInt();
		}
		
		//주사위 2개로 randnum 생성
		int[] randnum = new int[2];
		for(int i = 0; i < 2; i++) {
			randnum[i] = new Random().nextInt(6) + 1;
		}
		Arrays.sort(num);
		Arrays.sort(randnum);
		System.out.println("뽑은 숫자 : " + Arrays.toString(num));
		System.out.println("랜덤 숫자 : " + Arrays.toString(randnum));
		if(Arrays.equals(num, randnum)) {
			System.out.println("당첨 ! 30000원 지급");
			money += 30000;
		}
		else
			System.out.println("실패");
		
		System.out.println("현재 보유 금액 : "+ money);
		
	}
}
