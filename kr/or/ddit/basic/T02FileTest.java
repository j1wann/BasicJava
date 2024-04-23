package kr.or.ddit.basic;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class T02FileTest {
	public static void main(String[] args) throws IOException {
	
		
		File f1 = new File("d:/D_Other/sample.txt");
		File f2 = new File("d:/D_Other/test.txt");
		
		if(f1.exists()) {
			System.out.println(f1.getAbsolutePath()
					+ "은 존재합니다"); //절대경로
		}
		else {
			System.out.println(f1.getAbsolutePath() +
					"은 존재하지 않습니다.");
			if(f1.createNewFile()) {
				System.out.println(f1.getAbsolutePath()
						+ "파일을 새로 만들었습니다.");
			}
		}
		
		if(f2.exists()) {
			System.out.println(f2.getAbsolutePath()+ "은 존재합니다.");
		}
		else {
			System.out.println(f2.getAbsolutePath()+ "은 존재하지 않습니다.");
		}
		System.out.println("===========================================");
		
		
		File f3 = new File("d:/D_Other");
		File[] files = f3.listFiles();
		for(int i =0; i<files.length; i++) {
			System.out.print(files[i].getName()+"=>");
			if(files[i].isFile()) {
				System.out.println("파일");
			}
			else if(files[i].isDirectory()) {
				System.out.println("디렉터리(폴더)");
			}
		
		}
		System.out.println("=========================================");
		
		String[] fileNames = f3.list();
		for(String fileName : fileNames) {
			System.out.println(fileName);
		}
		System.out.println("===================================");
		
		
		displayFileList(new File("d:/D_Other"));
		
		
		
	}
	
	
	// 지정된 디렉토리(폴더)에 포함된 파일과 디렉터리 목록을 보여주는 메서드
	public static void displayFileList(File dir) {
		
		System.out.println("["+dir.getAbsolutePath()
		+"] 의 디렉터리 내용");
		
		// 디렉터리 안의 모든 파일 몱록을 가져온다.
		File[] files = dir.listFiles();
		
		// 디렉터리(폴더)의 인덱스 정보를 보관하기 위한 List객체 생성
		List<Integer> subDirList = new ArrayList<Integer>();
		
		// 날짜 정보를 출력하기 위한 포맷 설정
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd a hh:mm");
		
		for(int i= 0; i<files.length; i++) {
			String attr = ""; // 파일 속성 정보(읽기, 쓰기 , 숨김, 디렉터리 구분 등
			String size = ""; // 파일 용량(bytes)		
			
			if(files[i].isDirectory()) {
				attr = "<DIR>";
				subDirList.add(i);
			}else {
				size = files[i].length() + ""; 
				attr = files[i].canWrite() ? "R" : " ";
				attr += files[i].canRead() ? "W" : " ";
				attr += files[i].isHidden() ? "H" : " ";
			}
				System.out.printf("%s %-5s %12s %s\n", 
						sdf.format(new Date(files[i].lastModified())),
						attr, size, files[i].getName());
		} //for문 끝
		
		int dirCount = subDirList.size(); //폴더 개수
		int fileCount = files.length - dirCount; //파일 개수
		
		System.out.println(fileCount + "개의 파일,"
				+ dirCount + "개의 디렉토리(폴더)");
		System.out.println();
		
		for(Integer i :subDirList) {
			// 하위 폴더의 내용들도 출력해 보기
			// 현재 폴더를 이용한 재귀호출하기
			displayFileList(files[i]);
		}
		
	}
}
