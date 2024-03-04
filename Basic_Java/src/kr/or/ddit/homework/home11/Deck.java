package kr.or.ddit.homework.home11;

import java.util.Random;

public class Deck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.process();
	}

	public void process() {

		// 카드 리스트 호출
		Card[] deck = cardList();

		// 카드 섞기 (메소드로 구현)
		suffle(deck);

		// 랜덤한 카드 뽑기(내 카드), 맨위 카드(컴퓨터)
		// 승패 비교 (메소드로 구현)
		// 내 카드 숫자가 높을 경우 승리
		judge(deck);

	}
	public void judge(Card[] deck) {
		int ran = new Random().nextInt(deck.length);
		Card cpu = deck[0];
		Card user = deck[ran];
		if(cpu.num < user.num) {
			System.out.println("컴퓨터 : "+deck[0]);
			System.out.println("user : "+deck[ran]);
			System.out.println("유저 승리");
		}
		else if (cpu.num > user.num) {
			System.out.println("컴퓨터 : "+deck[0]);
			System.out.println("user : "+deck[ran]);
			System.out.println("컴퓨터 승리");
		}
		else{
			System.out.println("컴퓨터 : "+deck[0]);
			System.out.println("user : "+deck[ran]);
			System.out.println("무승부");
		}
			
	}

	public void suffle(Card[] deck) {
		for (int i = 0; i < 10000; i++) {
			int ran = new Random().nextInt(deck.length);
			Card temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;
		}
	}

	public Card[] cardList() {
		Card[] cardList = new Card[52];
		String[] types = { "♠", "◆", "♥", "♣" };
		int cur = 0;

		for (String type : types) {
			for (int i = 1; i <= 13; i++) {
				// 완성 할 것
				cardList[i - 1 + cur * 13] = new Card(i, type);
				
			}
			cur++;
			if(cur==4)
				break;
		}
		return cardList;
	}
}