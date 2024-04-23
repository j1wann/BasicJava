package kr.or.ddit.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 입출력 향상을 위한 보조 스트림
 * @author PC-14
 *
 */

public class T12BufferedIOTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("d:/D_Other/bufferTest.txt"));
			int data = 0;
			while((data = br.read()) != -1){
				System.out.println((char)data);
			}
			System.out.println("읽기 끝!");
			
			String temp = "";
			
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
