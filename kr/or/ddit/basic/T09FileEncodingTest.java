package kr.or.ddit.basic;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T09FileEncodingTest {
	/*
	 * @@인코딩 방식에 대하여
	 * 
	 * 현재 한글 인코딩 방식은 크게 UTF-8과 EUC-KR 방식으로 나누어진다
	 * 원래 한글윈도우는 CP949방식을 사용했는데 윈도우를 개발한 마소에서 EUC-KR방식에서 확장하였기 때문에
	 * MS949 방식이라고도 한다.
	 * CP949는 EUC-KR의 확장이며, 하위 호환성이 있다.
	 * - MS949 -> 한글윈도우의 기본 한글 인코딩 방식 (ANSI계열)
	 * - UTF-8 -> 유니코드의 UTF-8 인코딩 방식 
	 * 
	 * 참고 ) 한글 인코딩 처리 변천사
	 * ASCII -> extended ASCII (ISO 8859-1) 
	 * -> 조합형(초성, 중성, 종성), 완성형(KSC 5601) 
	 * 
	 * -> 윈도우 계열 : CP949(확장완성형) -일부문자(8822자)를 추가함
	 * -> 유닉스 계열 : EUC-KR(확장 유닉스 코드)
	 * 
	 * -> ANSI 계열 -> EUC-KR
	 * -> 유니코드 (UTF-8)					
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		FileInputStream fis = null;	//기반스트림
		InputStreamReader isr = null; //보조스트림
		
		try {
			fis = new FileInputStream("d:/D_Other/test_ansi.txt");
//			fis = new FileInputStream("d:/D_Other/test_utf8.txt");
			//파일 인코딩 정보를 이용하여 읽어오기
			// ex) new InputStreamReader(기반스트림객체, 인코딩 방식)
			isr = new InputStreamReader(fis, "EUC-KR");
			
			int data = 0;
			while((data = isr.read()) != -1) {
				System.out.println((char)data);
			}
			System.out.println();
			System.out.println("출력 끝");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				isr.close();	//보조스트림만 닫아도 된다.
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
