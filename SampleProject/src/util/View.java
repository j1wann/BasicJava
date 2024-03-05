package util;

public enum View {
	
	MAIN("홈"),						// 홈	
	MEMBER("회원"),						// 회원
	MEMBERLIST("회원리스트"),
	SIGN("회원가입"),
	ADMIN("관리자"),						// 관리자
	LOGIN("로그인");						// 로그인	
	
	String title;
	View(String title){
		this.title = title;
	}
	
}
