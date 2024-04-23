package kr.or.ddit.basic.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork05 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("d:/D_Other/Tulips.jpg");
			int data = 0;
			fos = new FileOutputStream("d:/D_Other/복사본_Tulips.jpg");
			while ((data = fis.read()) != -1) {
				try {
					fos.write(data);
				} catch (IOException ex) {
					ex.printStackTrace();
				} 
			}
			System.out.println("파일에 쓰기 작업 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}
}
