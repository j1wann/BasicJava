package kr.or.ddit.basic;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 기본타입 입출력 보조 스트림 예제
 * @author PC-14
 *
 */

public class T13DataIOStram {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("d:/D_Other/test.dat");
		//DataOutputStream은 출력을 데이터 자료형에 맞게 출력해준다.
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeInt(17);
		dos.writeFloat(3.14f);
		dos.writeDouble(3.14);
		dos.writeBoolean(true);
		dos.close();
		
		System.out.println("출력 완료");

		
		//출력한 데이터 읽어오기
		
		FileInputStream fis = new FileInputStream("d:/D_Other/test.dat");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("문자열 데이터 : " + dis.readUTF());
		System.out.println("정수형 데이터 : " + dis.readInt());
		System.out.println("실수(float)형 데이터 : " + dis.readFloat());
		System.out.println("실수(double)형 데이터 : " + dis.readDouble());
		System.out.println("논리형 데이터 " + dis.readBoolean());
		
		
		
		dis.close();
		
		System.out.println();
		
		System.out.println("읽어오기 끝");
		
	} 
}
