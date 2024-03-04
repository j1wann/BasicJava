package kr.or.ddit.homework.home16;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class HomeWork16 {
	public static void main(String[] args) {
		HomeWork16 hw = new HomeWork16();
		hw.process();
	}
	
	public void process() {
		/*		
		 *    Nation 클래스 
		 *    1. tax  메소드 생성
		 *    2. game 메소드 생성
		 *    
		 *    1 -> 게임 시행시 모든 보유 금액에 관하여 세금이 매겨짐
		 *    2 -> 각 게임별 성공시 보상 금액 제공
		 * 
		 *    A 나라에서는 
		 *      1. 세금이 10% + 생활비 1000
		 *      2. 주사위 2개 숫자 맞추기 게임. (상금 : 30000)  
		 *    B 나라에서는 
		 *      1. 세금이 15% + 생활비 2000
		 *      2. 가위바위보 게임  (상금 : 20000)
		 *    C 나라에서는 
		 *      1. 세금이 20% + 생활비 3000
		 *    	2. 홀짝 게임   (상금 : 15000)
		 *     
		 */
		int cnt=0;
		int money =10000;
		while(cnt++<10) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. A나라");
			System.out.println("세금이 10% + 생활비 1000");
			System.out.println("주사위 2개 숫자 맞추기 게임. (상금 : 30000)");
			System.out.println("2. B나라");
			System.out.println("세금이 15% + 생활비 2000");
			System.out.println("가위바위보 게임  (상금 : 20000)");
			System.out.println("3. C나라");
			System.out.println("세금이 20% + 생활비 3000");
			System.out.println("홀짝 게임   (상금 : 15000)");
			System.out.println("\n나라 선택");
			int select = sc.nextInt();
			Nation2 N = null;
			if(select == 1) 
				N = new A();
			else if(select == 2)
				N = new B();
			else
				N = new C();
			
			money = N.tax(money);
			N.game(money);
			if(money < 0) {
				System.out.println("잔액이 부족합니다");
				break;
			}
				
		}
		
	}
}
