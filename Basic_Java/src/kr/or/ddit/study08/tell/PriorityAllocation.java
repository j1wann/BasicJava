package kr.or.ddit.study08.tell;

public class PriorityAllocation extends Schdeular{
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("우선 순위가 높은 상담전화를 대기열에서 가져옴");
	}
	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무스킬이 가장 우수한 상담원에게 상담전화를 분배");
	}
}
