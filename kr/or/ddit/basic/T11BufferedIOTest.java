package kr.or.ddit.basic;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 입출력 성능향상을 위한 보조스트림 예제
 * 
 * @author PC-14
 *
 */

public class T11BufferedIOTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("d:/D_Other/bufferTest.txt");
			
			//버퍼 크기를 지정하지 않으면 기본적으로 버퍼 크기가 8192byte(8KB)로 설정됨.
			bos = new BufferedOutputStream(fos, 5);
			// : 5byte크기를 가진 BufferedOutputStream
			
			for(char ch = '1'; ch <= '9'; ch++) {
				bos.write(ch);
			}
			
			System.out.println("작업 끝!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close(); // 보조스트림만 닫아도 됨.
				fos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
