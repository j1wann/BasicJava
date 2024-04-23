package kr.or.ddit.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class T14PrintStreamTest {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("d:/D_Other/print.txt");
		
		PrintStream out = new PrintStream(fos);
		out.print("안녕하세요. PrintStream입니다.\n");
		out.println("안녕하세요. PrintStream입니다2.");
		out.println("안녕하세요. PrintStream입니다3.");
		out.println(out); //객체 출력
		out.println(3.14);
		out.close();
		
		/*
		 * PrintStream은 데이터를 문자로 출력하는 기능을 수행함
		 * 보다 향상된 기능의 PrintWriter가 추가되었지만 계속 사용됨.
		 * PrintWriter가 PrintStream보다 다양한 문자를 처리하는데 적합하다.
		 */
		FileOutputStream fos2 = new FileOutputStream("d:/D_Other/print2.txt");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(fos2, "CP949"));
		
		pw.print("안녕하세요. PrintWriter입니다. \n");
		pw.println("안녕하세요. PrintWriter입니다2.");
		pw.println("안녕하세요. PrintWriter입니다3.");
		pw.println(out);
		pw.println(3.14);
		pw.close();
		
		System.out.println("작업 끝");
		
		
	
	}
}
