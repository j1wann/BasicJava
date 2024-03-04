package kr.or.ddit.study06.sec03;

import java.util.Scanner;

public class WeekExample {
	 

	public static void main(String[] args) {
		
		for(Week week : Week.values()) {
			System.out.println(week+", "+week.kor);
		}
		
	}

}
