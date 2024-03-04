package kr.or.ddit.homework.home10;

public class Tv {
	int year;
	String brandName;
	double size;
	public Tv(int year, String brandName, int size) {
		this.year = year;
		this.brandName = brandName;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Tv [year=" + year + ", brandName=" + brandName + ", size=" + size + "]";
	}
	
}
