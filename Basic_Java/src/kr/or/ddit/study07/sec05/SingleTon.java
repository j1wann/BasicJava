package kr.or.ddit.study07.sec05;

public class SingleTon {//객체 참조변수 생성 > 생성자 private > public 생성자 호출 함수 (참조변수 null 조건
//	private static SingleTon instance = null;
//	private SingleTon() {
//		
//	}
//	public static SingleTon getInstance() {
//		if(instance == null) {
//			instance = new SingleTon();
//			return instance;
//		}
//		else
//			return instance;
//	}
	private static SingleTon instance = null; 

	private SingleTon() {

	}

	public static SingleTon getInstance() {

		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
}
