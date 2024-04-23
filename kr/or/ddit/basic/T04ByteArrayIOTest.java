package kr.or.ddit.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class T04ByteArrayIOTest {

	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		byte[] temp = new byte[4];
		
				
		// 스트림객체 생성하기 
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int readBytes = 0; //읽어온 바이트 데이터를 저장할 변수
		
		// read() 메서드 -> byte단위로 데이터를 읽어와 int형으로 반환함
		// 더 이상 읽어올 데이터가 존재하지 않으면 -1을 반환함
		
		while((readBytes = bais.read(temp)) != -1) {
			System.out.println("temp -> " + Arrays.toString(temp));
			baos.write(temp, 0, 4);
		}
		
		// 출력된 스트림 데이터를 바이트 배열로 반환해주는 메서드
		outSrc = baos.toByteArray();
		
		System.out.println("inSrc -> " + Arrays.toString(inSrc));
		System.out.println("outSrc -> " + Arrays.toString(outSrc));
		
		// 사용 끝난 스트림 객체 닫아주기
		bais.close();
		baos.close();
		
	}
}
