package kr.or.ddit.study07.sec06;

public class Book {
	// 책 이름 저자 출판사 출판일
	// toString get/setter 만들어서 호출해볼 것
	private String name;
	private String writer;
	private String pubName;
	private int pubDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public int getPubDate() {
		return pubDate;
	}
	public void setPubDate(int pubDate) {
		this.pubDate = pubDate;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + ", pubName=" + pubName + ", pubDate=" + pubDate + "]";
	}
	
	
	
}
