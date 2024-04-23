package kr.or.ddit.basic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class T07FileWriterTest {
	public static void main(String[] args) throws IOException {
		
		// 사용자가 입력한 내용을 그대로 파일로 저장하기
		// InputStreamReader -> 바이트기반 스트림을 문자기반 스트림으로 변환해주는 보조스트림
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		FileWriter fw = new FileWriter("d:/D_Other/testChar.txt");
		
		System.out.println("아무거나 입력하세요 : ");
		int data = 0;
		
		// 콘솔에서 입력할 때 입력의 끝 표시는 Ctrl + Z 입력으로 처리
		while((data = isr.read()) != -1) {
			fw.write(data);
		}
		System.out.println("작업 끝");
		
		isr.close();
		fw.close();
	}
}
