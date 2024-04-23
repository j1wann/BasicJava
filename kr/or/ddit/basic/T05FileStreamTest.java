package kr.or.ddit.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 파일 내용 읽기
 * @author PC-14
 *
 */

public class T05FileStreamTest {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File("d:/D_Other/test2.txt"));
			
			int data = 0;
			
			while((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}
