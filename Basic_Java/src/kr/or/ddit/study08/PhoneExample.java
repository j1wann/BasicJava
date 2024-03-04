package kr.or.ddit.study08;

public class PhoneExample {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.model = "폰";
		phone.color = "검정";
		
		SmartPhone smart = new SmartPhone();
		smart.model = "스마트폰";
		smart.color = "흰색";
		smart.call();
		
		DmbPhone dmb = new DmbPhone();
		dmb.call();
		
		smart.touch();
		smart.internet();
		
		IPhone iphone = new IPhone();
		iphone.appStore();
		iphone.call();
		
		
	}
}
