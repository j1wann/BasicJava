package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}

	public void process() {
		/*
		 * 0 > 가위, 1 > 바위, 2 > 보 컴퓨터가 랜덤으로 내는 가위바위보와 내가 입력한 가위바위보를 비교해서 승패를 출력 math 랜덤을
		 * 사용해서 내게 할 것
		 */
		double randnum = Math.random();
		String cpu;
		String input;

		if (randnum <= 0.333333)
			cpu = "가위"; // 가위
		else if (randnum > 0.333333 && randnum <= 0.666666)
			cpu = "바위"; // 바위
		else
			cpu = "보"; // 보

		System.out.print("가위 바위 보 ? : ");
		input = sc.next();
		
		System.out.println("컴퓨터 : " + cpu + ", 나 : " + input);	//값 확인
		
		if (input.equals("가위")) {
			switch (cpu) {
			case "가위":
				System.out.println("비겼다");
				break;
			case "바위":
				System.out.println("졌다");
				break;
			case "보":
				System.out.println("이겼다");
				break;
			}
		} else if (input.equals("바위")) {
			switch (cpu) {
			case "가위":
				System.out.println("이겼다");
				break;
			case "바위":
				System.out.println("비겼다");
				break;
			case "보":
				System.out.println("졌다");
				break;
			}
		} else{
			switch (cpu) {
			case "가위":
				System.out.println("졌다");
				break;
			case "바위":
				System.out.println("이겼다");
				break;
			case "보":
				System.out.println("비겼다");
				break;
			}
		}
	}
}
