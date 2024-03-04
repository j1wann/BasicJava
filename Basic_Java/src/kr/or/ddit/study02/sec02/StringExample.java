package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		// 문자와 문자열
		// 문자 : 한 글자데이터로 '' 로 묶어 선언 > char
		// 문자열 : 복수개의 글자로 구성된 자료(데이터 타입은 아님), ""로 묶어 사용 > String
		String name1 = "강감찬";
		String name2 = "이순신";
		System.out.println("\"" + name1 + "\"\t\"" + name2 + "\"");
		/*
		 * \r : 커서 위치를 현재줄의 처음으로 옮김 (\n) \t : 스크린 커서를 다음 탭으로 옮김 \\ : 역슬래시 문자 출력 \" :
		 * 큰따옴표 출력 \' : 작은 따옴표 출력
		 */
	}
}
