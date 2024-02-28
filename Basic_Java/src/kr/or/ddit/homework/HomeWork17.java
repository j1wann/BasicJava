package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork17 hw = new HomeWork17();
		Calendar cal = Calendar.getInstance();
		hw.process(cal);
		
		
	}
	public void process(Calendar cal) {
		//달력 출력하기
		//다음달을 입력하면 다음달 달력 출력
		//이전달을 입력하면 이전달 달력 출력
		while(true) {
			
			setDate(cal);
			printDay(cal);
			
			System.out.println("<       \t\t\t\t\t>");
			String input = sc.next();
			setMonth(input, cal);
		}
	}
	
	public void setDate(Calendar cal) {
		
		cal.set(Calendar.DATE, 1);
	}
	
	public void printDay(Calendar cal) {
		
		int blank = cal.get(Calendar.DAY_OF_WEEK); //달 요일 시작
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+ 1 + "월");
		System.out.println("일 \t월 \t화 \t수 \t목 \t금 \t토");
		
		for(int i = 1; i < blank; i++) {
			System.out.print(" \t");
		}
		
		
		for(int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++){
			if(cal.get(Calendar.DAY_OF_WEEK) == 1)
				System.out.println();
			System.out.print(cal.get(Calendar.DATE));
			if(i != cal.getActualMaximum(Calendar.DATE))
				cal.add(Calendar.DATE, 1);
			System.out.print(" \t");
		
		}
		System.out.println();
	}
	public void setMonth(String input, Calendar cal) {
		
		if(input.equals("<")) {
			cal.add(Calendar.MONTH, -1);
		}
		if(input.equals(">")) {
			cal.add(Calendar.MONTH, 1);
		}
		
	}
}
