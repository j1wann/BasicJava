package kr.or.ddit.study08.tell;

import java.util.Scanner;
public class TellMain {
	public static void main(String[] args) {
		System.out.println("전화 상담 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		Scanner sc = new Scanner(System.in);
		/*
		 * Schdeular 클래스
		 * getNextCall();
		 * sendCallToAgent();
		 * 
		 * RoundRobn, LeastJob, PriorityAllocation 클래스는 각각
		 * Schdeular 클래스 상속 후 각 메세지를 출력할 것
		 * 
		 * PriorityAllocation
		 * 1 > 우선 순위가 높은 상담전화를 대기열에서 가져옴
		 * 2 > 업무스킬이 가장 우수한 상담원에게 상담전화를 분배
		 * 
		 * LeastJob
		 * 1 > 상담전화를 대기열에서 차례대로 가져옴
		 * 2 > 대기열이 가장 짧ㅅ은 상담원에게 상담전화를 분배
		 * 
		 * RoundRobn
		 * 1 > 상담전화를 대기열에서 차례대로 가져옴
		 * 2 > 차례대로 상담원에게 상담전화를 분배
		 * 
		 */
		String select = sc.next();
		Schdeular tell = null;
		if(select.equals("P")) {
			tell = new PriorityAllocation();
		}
		if(select.equals("R")) {
			tell = new RoundRobn();
		}
		if(select.equals("L")) {
			tell = new LeastJob();
		}
		tell.getNextCall();
		tell.sendCallToAgent();
		
	}
}
