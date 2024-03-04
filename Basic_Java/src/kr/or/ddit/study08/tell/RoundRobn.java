package kr.or.ddit.study08.tell;

public class RoundRobn extends Schdeular{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담전화를 대기열에서 차례대로 가져옴");
	}
	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("차례대로 상담원에게 상담전화를 분배");
	}
}
