package kr.or.ddit.basic;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * 문자기반 스트림을 이용한 파일읽기 예제
 * @author PC-14
 *
 */

public class T08FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("d:/D_Other/testChar.txt");
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.println((char) data);
			}
			System.out.println();
			System.out.println("출력 끝");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}

