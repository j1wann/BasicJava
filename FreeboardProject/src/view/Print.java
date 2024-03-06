package view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Print {
	public void printVar() {
		System.out.println("============================");
	}
	
	public void printLn(int line) {
		for(int i = 0; i < line; i++) {
			System.out.println();
		}
	}
	public void printFreeList(List<Map<String, Object>> freeList) {
		System.out.println("no\ttitle\tcontent\twriter\tregdate\t\tcount");
		for(Map<String, Object> map : freeList) {
			// Number -> BigDecimal
			// Date -> TimeStamp
			// Varchar2 -> String
			BigDecimal no = (BigDecimal) map.get("NO");
			String title = (String) map.get("TITLE");
			String content = (String) map.get("CONTENT");
			String writer = (String) map.get("WRITER");
			String regdate = (String)map.get("REGDATE");
			BigDecimal count = (BigDecimal) map.get("COUNT");
			
			System.out.println(no +"\t" +title+"\t"+content+"\t" + writer+"\t"+ regdate+"\t"+count);
		}
		System.out.println("1. 게시판 상세 조회.");
		System.out.println("2. 게시판 작성");
		System.out.println("3. 홈");
	}
	public void printHome() {
		printVar();
		System.out.println("1. 전체 게시판 조회.");
		System.out.println("2. 게시판 작성");
		System.out.println("3. 홈");
		printLn(4);
		printVar();
	}
	
}
