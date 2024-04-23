package kr.or.ddit.basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class T10FileEncodionTest {
	/*
	 * 키보드로 입력한 내용을 파일로 저장하는데
	 * out_utf8.txt 파일은 'UTF8' 인코딩 방식으로 저장하고
	 * out_ansi.txt 파일은 MS949 방식으로 저장해보자
	 */
	
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		
		//파일 출력용 스트림 준비하기
		FileOutputStream fos1 = new FileOutputStream("d:/D_Other/out_utf8.txt");
		FileOutputStream fos2 = new FileOutputStream("d:/D_Other/out_ansi.txt");
		
		/*
		 * OutputStreamWriter -> 바이트기반 스트림을 문자기반 스트림으로 변환해주는 보조스트림
		 * 이 스트림도 직접 인코딩방식을 지정할 수 있다.
		 */
		
		OutputStreamWriter osw1 = new OutputStreamWriter(fos1, "UTF8");
		OutputStreamWriter osw2 = new OutputStreamWriter(fos2, "MS949");
		
		System.out.println("아무거나 입력하세요 :");
		
		int data = 0;
		while((data = isr.read()) != -1) {
			osw1.write(data);
			osw2.write(data);
		}
		
		System.out.println("작업 완료 !");
		isr.close();
		osw1.close();
		osw2.close();
		
	}
	
}
