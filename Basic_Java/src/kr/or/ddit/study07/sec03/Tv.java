package kr.or.ddit.study07.sec03;

public class Tv {
	String company;
	int year;
	double size;

	public Tv(String company, int year, double size) {
	this.company = company;
	this.year = year;
	this.size = size;
	System.out.println(this.company);
	System.out.println(this.year);
	System.out.println(this.size);
	}

	@Override
	public String toString() {
		return "Tv [company=" + company + ", year=" + year + ", size=" + size + "]";
	}
	
}