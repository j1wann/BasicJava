package kr.or.ddit.homework.home12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HomeWork12 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork12 hw = new HomeWork12();
		hw.process();
	}

	public void process() {
		// 사람 클래스 만들고
		// 필드 값으로는 돈, 이름 입력받고 시작
		LottoMain lottoMc = new LottoMain();
		int[] answer = lottoMc.generateLotto(); // 당첨번호
		int money = 0;
		String name = "";
		int buy = 0;
		int[][][] lotto = null;
		System.out.print("이름 돈 입력하세요 : ");
		name = sc.next();
		money = sc.nextInt();

		Person user1 = new Person(money, name);

		// 로또번호가 1 ~ 8 까지
		// 6개의 번호를 뽑아서 만들 것

		// while문을 통해 로또 구매할 숫자를 선택하고
		while (true) {
			System.out.println("=========돈이 부족하거나 -1 입력 시 종료=========");
			System.out.println(user1);
			System.out.println("몇 개? : ");
			buy = sc.nextInt();
			if (buy == -1) {
				System.out.println("=======종료=======");
				break;
			} else if (user1.money < buy * 1000) {
				System.out.println("돈이 부족해요");
			} else if (user1.money >= buy * 1000) {
				lotto = lottoMc.lottoBundel(buy * 1000);
				user1.money -= buy * 1000;
				System.out.println("=======당첨 번호=======");
				System.out.println(Arrays.toString(answer));
				System.out.println("=======뽑은 번호=======");
				lottoMc.printBundle(lotto);
				result(lotto, answer, user1);
			}

			// 구매 후에 로또 추첨을 진행한다.

		}

		// 로또 6개 번호가 다 맞는다면
		// 10000(1만) 상금 지급

	}

	public void result(int[][][] bundle, int[] answer, Person user) {
		boolean res = false;
		for (int[][] paper : bundle) {
			for (int[] lotto : paper) {
				if (Arrays.equals(lotto, answer)) {
					user.money += 100000;
					res = true;
				}
			}
		}
		if (res)
			System.out.println("!!!!! 당첨 !!!!!");
		else
			System.out.println("당첨 안됨");
	}

}
