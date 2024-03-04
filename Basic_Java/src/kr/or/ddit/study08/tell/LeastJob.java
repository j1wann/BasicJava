package kr.or.ddit.study08.tell;

public class LeastJob extends Schdeular{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담전화를 대기열에서 차례대로 가져옴");
	}
	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("대기열이 가장 짧은 상담원에게 상담전화를 분배");
	}
}
