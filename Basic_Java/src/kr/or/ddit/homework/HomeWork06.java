package kr.or.ddit.homework;
import java.util.Random;
import java.util.Scanner;
public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.method1();
	}
	public void method1() {
		/*
		 * 6개의 단어가 제공
		 * 이 중 임의의 단어가 선택된다.
		 * 사용자는 이를 보고 원래 단어를 입력한다. 
		 * 사용자가 단어를 맞출 때 까지 반복하며 단어를 맞췄을 때 시도횟수 출력 
		 */
		int count = 1;
		String[] words = {"deserve", "cart", "fright", "scrub", "amount", "laugh"};
		int ran = new Random().nextInt(words.length);
		String select = words[ran];
		
		char[] ch = select.toCharArray(); //toCharArray > string을 char[]로 전환
		for(int i = 0; i < 10000; i ++) {
			int ran2 = new Random().nextInt(ch.length);
			char temp = ch[0];
			ch[0] = ch[ran2];
			ch[ran2] = temp;
		}
		System.out.println(ch);
		
		while(true) {
			System.out.print("정답은? : ");
			String answer = sc.nextLine();
			
				if(select.equals(answer)) {
					System.out.println(count+"번 시도했습니다.");
					break;
				}
				else {
					System.out.println("틀렸습니다.");
					count++;
			}
		}
	}
}
