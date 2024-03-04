package kr.or.ddit.study07.sec06;

public class BookExample {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("책1");
		b1.setPubDate(240224);
		b1.setPubName("출판사1");
		b1.setWriter("저자1");
		System.out.println(b1.getPubDate());
		
		Book b2 = new Book();
		b2.setName("책2");
		b2.setPubDate(211215);
		b2.setPubName("출판사2");
		b2.setWriter("저자2");
		System.out.println(b2.getWriter());
		
		Book b3 = new Book();
		b3.setName("책2");
		b3.setPubDate(220106);
		b3.setPubName("출판사2");
		b3.setWriter("저자2");
		System.out.println(b3.getClass());
		 
	}    
}